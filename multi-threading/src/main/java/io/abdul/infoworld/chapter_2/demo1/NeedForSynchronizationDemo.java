package io.abdul.infoworld.chapter_2.demo1;

// NeedForSynchronizationDemo.java
// This is called Race condition - combined behaviors of multiple threads that lead to inconsistencies
class NeedForSynchronizationDemo {
    public static void main(String[] args) {
        FinTrans ft = new FinTrans();
        TransThread tt1 = new TransThread(ft, "Deposit Thread");
        TransThread tt2 = new TransThread(ft, "Withdrawal Thread");
        tt1.start();
        tt2.start();
    }
}

class FinTrans {
    public static String transName;
    public static double amount;
}

class TransThread extends Thread {
    private FinTrans ft;

    TransThread(FinTrans ft, String name) {
        super(name); // Save thread's name
        this.ft = ft; // Save reference to financial transaction object
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (getName().equals("Deposit Thread")) {
                // Start of deposit thread's critical code section
                ft.transName = "Deposit"; // shared mutation
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                }
                ft.amount = 2000.0; // shared mutation
                System.out.println(ft.transName + " " + ft.amount);
                // End of deposit thread's critical code section
            } else {
                // Start of withdrawal thread's critical code section
                ft.transName = "Withdrawal"; // shared mutation
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                }
                ft.amount = 250.0; // shared mutation
                System.out.println(ft.transName + " " + ft.amount);
                // End of withdrawal thread's critical code section
            }
        }
    }
}