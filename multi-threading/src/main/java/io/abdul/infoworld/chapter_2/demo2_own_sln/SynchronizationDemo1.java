package io.abdul.infoworld.chapter_2.demo2_own_sln;

// SynchronizationDemo1.java
class SynchronizationDemo1 {
    public static void main(String[] args) {
        Object lock = new Object();
        TransThread tt1 = new TransThread(lock, "Deposit Thread");
        TransThread tt2 = new TransThread(lock, "Withdrawal Thread");
        // Below is not actual way
//        Object lock1 = new Object();
//        Object lock2 = new Object();
//        TransThread tt1 = new TransThread(lock1, "Deposit Thread");
//        TransThread tt2 = new TransThread(lock2, "Withdrawal Thread");
        tt1.start();
        tt2.start();
    }
}

class FinTrans {
    public static String transName;
    public static double amount;
}

class TransThread extends Thread {
    private final Object lock;

    TransThread(Object lock, String name) {
        super(name); // Save thread's name
        this.lock = lock;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (getName().equals("Deposit Thread")) {
                synchronized (lock) {
                    FinTrans.transName = "Deposit";
                    try {
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                    }
                    FinTrans.amount = 2000.0;
                    System.out.println(FinTrans.transName + " " + FinTrans.amount);
                }
            } else {
                synchronized (lock) {
                    FinTrans.transName = "Withdrawal";
                    try {
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                    }
                    FinTrans.amount = 250.0;
                    System.out.println(FinTrans.transName + " " + FinTrans.amount);
                }
            }
        }
    }
}