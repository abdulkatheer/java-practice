package io.abdul.infoworld.chapter_1.demo2;

// NameThatThread.java
class NameThatThread {
    public static void main(String[] args) {
        System.out.println("Main thread name is: " + Thread.currentThread().getName());
        MyThread mt;
        if (args.length == 0)
            mt = new MyThread();
        else
            mt = new MyThread(args[0]);
        mt.start();
    }
}

class MyThread extends Thread {
    MyThread() {
        // The compiler creates the byte code equivalent of super ();
    }

    MyThread(String name) {
        super(name); // Pass name to Thread superclass
    }

    public void run() {
        System.out.println("My name is: " + getName());
    }
}