package io.abdul.infoworld.chapter_2.demo3_own_sln2;

// SynchronizationDemo1.java
// Static resources can be synchronized by locking the class object
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
                synchronized (FinTrans.class) {
                    FinTrans.transName = "Deposit";
                    try {
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                    }
                    FinTrans.amount = 2000.0;
                    System.out.println(FinTrans.transName + " " + FinTrans.amount);
                }
            } else {
                synchronized (FinTrans.class) {
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