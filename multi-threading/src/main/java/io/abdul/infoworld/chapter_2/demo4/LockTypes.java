package io.abdul.infoworld.chapter_2.demo4;

class LockTypes {
    // Object lock acquired just before execution passes into instanceMethod()
    synchronized void instanceMethod() {
        // Object lock released as thread exits instanceMethod()
    }

    // Class lock acquired just before execution passes into classMethod()
    synchronized static void classMethod(LockTypes lt) {
        lt.instanceMethod();
        // Object lock acquired just before critical code section executes

        synchronized (lt) {
            System.out.println("");
            // Critical code section
            // Object lock released as thread exits critical code section
        }
        // Class lock released as thread exits classMethod()
    }
}