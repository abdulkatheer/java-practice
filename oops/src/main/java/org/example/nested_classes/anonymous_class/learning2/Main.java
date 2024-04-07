package org.example.nested_classes.anonymous_class.learning2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello there!");
            }
        });
        t.start();
        t.join();
    }
}
