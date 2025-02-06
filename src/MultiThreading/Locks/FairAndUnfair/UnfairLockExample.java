package MultiThreading.Locks.FairAndUnfair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// unfair lock means jo thread pehele aya hai jaruri nahi hai ki use hee lock mile, this is unfairness.
public class UnfairLockExample {
        private final Lock lock = new ReentrantLock(); // ye humne lock ka object banaya hai.

        public void accessResource() {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }finally {
                System.out.println(Thread.currentThread().getName() + " released the lock.");
//              print statement lock release karne se pehle likha, varan ulte pulte print hote
                lock.unlock();
            }
    }

    public static void main(String[] args) {
        UnfairLockExample unfairLock = new UnfairLockExample();

        Runnable task = new Runnable(){
            @Override
            public void run(){
                unfairLock.accessResource();
            }
        };

        Thread thread1 = new Thread(task,"Thread - 1");  // same obj ka resource teeno access kar re hai
        Thread thread2 = new Thread(task,"Thread - 2");  // same obj ka resource teeno access kar re hai
        Thread thread3 = new Thread(task,"Thread - 3");  // same obj ka resource teeno access kar re hai

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
