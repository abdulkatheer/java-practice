package io.abdul.infoworld.chapter_1.demo3;

// CalcPI1.java
class CalcPI1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            // reduce time to see invalid PI
            Thread.sleep(10); // main thread sleeps
        } catch (InterruptedException e) {
        }
        System.out.println("pi = " + mt.pi + "; threadState=" + mt.getState());
    }
}

class MyThread extends Thread {
    boolean negative = true;
    double pi; // Initializes to 0.0, by default

    public void run() {
        for (int i = 3; i < 100000; i += 2) {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        System.out.println("Finished calculating PI");
    }
}