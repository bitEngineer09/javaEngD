package engineeringDigestCoreJava.MultiThreading.Locks.ExplicitLockUseCaseScenario;

import engineeringDigestCoreJava.MultiThreading.Locks.bankAccount;

public class Test {
    public static void main(String[] args) {
        bankAccount sbi = new bankAccount();
        Runnable task = new Runnable() { // Anonymous class
            @Override
            public void run() {
                sbi.withdraw(40);
            }
        };

        Thread t1 = new Thread(task); // ek hee object ko do thread acces kar re hai, that can lead to race condition.
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
