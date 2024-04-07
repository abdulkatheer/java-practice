package io.abdul.infoworld.chapter_2.demo3_own_prblm1;

// SynchronizationDemo1.java
// Incorrect way of sync. Thread tries to get its own lock and it will be always feasible.
// No thread will get other threads lock by default.
class SynchronizationDemo1 {
    public static void main(String[] args) {
        TransThread tt1 = new TransThread("Deposit Thread");
        TransThread tt2 = new TransThread("Withdrawal Thread");
        tt1.start();
        tt2.start();
    }
}

class FinTrans {
    public static String transName;
    public static double amount;
}

class TransThread extends Thread {

    TransThread(String name) {
        super(name); // Save thread's name
    }

    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            if (getName().equals("Deposit Thread")) {
                FinTrans.transName = "Deposit";
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                }
                FinTrans.amount = 2000.0;
                System.out.println(FinTrans.transName + " " + FinTrans.amount);
            } else {
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