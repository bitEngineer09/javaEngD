package engineeringDigestCoreJava.MultiThreading.Locks;

public class Test {
    public static void main(String[] args) {
        bankAccount sbi = new bankAccount();
        Runnable task = new Runnable() { // Anonymous class
            @Override
            public void run() {
                sbi.withdraw(40);
            }
        };

        Thread t1 = new Thread(task, "Thread 1"); // ek hee object ko do thread acces kar re hai, that can lead to race condition.
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
