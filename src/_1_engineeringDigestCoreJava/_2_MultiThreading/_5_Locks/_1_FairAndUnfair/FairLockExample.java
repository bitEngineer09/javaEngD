package _1_engineeringDigestCoreJava._2_MultiThreading._5_Locks.FairAndUnfair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
    private final Lock lock = new ReentrantLock(true); // ab humne fairness true kar diya, ab fairness aaegi
//  eska matlab ye hai ki jo Thread pehle req karega vo pehle lock acquire karega,
//  but jaruri nahi hai ki thread 1 hee pehle req karke lock acquire kar le.
//  so agar line vise hee lock acuire karna chahte ho to har thread ke start ke baad kuch time ke liye
//  sleep kar do taaki us thread ko time mil jaaye req bhejne ka then lock, acquire karne ka.

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
        FairLockExample fairLock = new FairLockExample();

        Runnable task = new Runnable(){
            @Override
            public void run(){
                fairLock.accessResource();
            }
        };

        Thread thread1 = new Thread(task,"Thread - 1");  // same obj ka resource teeno access kar re hai
        Thread thread2 = new Thread(task,"Thread - 2");  // same obj ka resource teeno access kar re hai
        Thread thread3 = new Thread(task,"Thread - 3");  // same obj ka resource teeno access kar re hai
        try{
            thread1.start();
            Thread.sleep(50);
            thread2.start(); /// ye thread 50 milli's ke baad req karega etne me thread 1 ko time mil jaaega
            Thread.sleep(50);
            thread3.start();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

}

