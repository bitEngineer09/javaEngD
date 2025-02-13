package engineeringDigestCoreJava.MultiThreading.Locks.ReadAndWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Read Write lock allows multiple threads to read resources concurrently as long as no thread is writing to it.
// It ensures exclusive access for write operations.

public class ReadWriteCounter {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock(); // ye humne ReentrantReadWriteLock ka instance bana diya hai, naam hai lock

    private final Lock readlock = lock.readLock();
// ye pair hume rakhna hee padta hai
    private final Lock writelock = lock.writeLock();

    public void increment() {
        writelock.lock();
        try{
            count++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }finally{
            writelock.unlock();
        }
    }

    public int getCount(){
        readlock.lock(); // multiple threads can acquire this readLock,
                         // but condn. is that us time writeLock kisi or thread ne access naa kiya ho
        try{
            return count;
        }finally{
            readlock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReadWriteCounter counter = new ReadWriteCounter(); // class ka humne instance bana liya

// ese aise samjho ki ye readTask and writeTask are classes.
// vaise fri ese alag se class banake extends karate hai thread me yaa fir implement karte Runnable interface.
// simply yaha do classes banayi jo ki implement kar ri hai runnable ko.

        Runnable readTask = new Runnable() {  // runnable ka pehla instance banaya hai,
                                              // means ki runnable ki implementation class bana lii hai, coz RUNNABLE is an interface.

// ye bass Thread ka naam lega and read karega counter ki value ko, ye class bass read ka kaam karega
            @Override
            public void run(){
                for (int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {  // runnable ka dusra instance banaya hai
                                               // means ki runnable ki implementation class bana lii hai, coz RUNNABLE is an interface.

// ye class bass write karega, yaah 0 - 9 counter increment karega

            @Override
            public void run(){
                for (int i = 0; i < 10; i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };

        Thread writerThread = new Thread(writeTask);  // ek thread write karega and counter ko increment karega
        Thread readerThread1 = new Thread(readTask);  // do thread read karenge.
        Thread readerThread2 = new Thread(readTask);  // do thread read karenge.

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join(); // join ke liye Exception handle karna padega.
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
