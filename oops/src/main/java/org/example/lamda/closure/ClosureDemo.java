package org.example.lamda.closure;

interface Processor {
    void process(int i);
}

interface Counter {
    void count();
}

public class ClosureDemo {
    private int count;

    public static void main(String[] args) {
        int a = 20;
        // value of a is copied to the lambda or anonymous inner class.
        Processor processorAnonymous = new Processor() {
            //            a = 30;
            @Override
            public void process(int i) {
                System.out.println(i + a);
            }
        };
        doProcess(20, processorAnonymous);

        Processor processorLamda = (i) -> System.out.println(i + a);
        doProcess(a, processorLamda);

        System.out.println("-".repeat(20));

        ClosureDemo c = new ClosureDemo();
        Counter c1 = c.getCounter();
        Counter c2 = c.getCounter();
        Counter c3 = c.getCounter();
        c1.count();
        System.out.println(c.getCount());
        c2.count();
        System.out.println(c.getCount());
        c3.count();
        System.out.println(c.getCount());
    }

    private static void doProcess(int value, Processor processor) {
        processor.process(value);
    }

    Counter getCounter() {
        int x = 10;
        return () -> {
            System.out.println(x);
            count++;
        };
    }

    public int getCount() {
        return count;
    }
}
