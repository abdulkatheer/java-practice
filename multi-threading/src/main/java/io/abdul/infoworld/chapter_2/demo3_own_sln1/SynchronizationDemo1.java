package io.abdul.infoworld.chapter_2.demo3_own_sln1;

// SynchronizationDemo1.java
class SynchronizationDemo1 {
    public static void main(String[] args) {
        FinTrans ft = new FinTrans();
        TransThread tt1 = new TransThread(ft, "Deposit Thread");
        TransThread tt2 = new TransThread(ft, "Withdrawal Thread");
        tt1.start();
        tt2.start();
    }
}

class FinTrans {
    public String transName;
    public double amount;

    public synchronized void deposit() {
        this.transName = "Deposit";
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        this.amount = 2000.0;
        System.out.println(this.transName + " " + this.amount);
    }

    public synchronized void withdrawal() {
        this.transName = "Withdrawal";
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        this.amount = 250.0;
        System.out.println(this.transName + " " + this.amount);
    }
}

class TransThread extends Thread {
    private final FinTrans ft;

    TransThread(FinTrans ft, String name) {
        super(name); // Save thread's name
        this.ft = ft; // Save reference to financial transaction object
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (getName().equals("Deposit Thread")) {
                ft.deposit();
            } else {
                ft.withdrawal();
            }
        }
    }
}