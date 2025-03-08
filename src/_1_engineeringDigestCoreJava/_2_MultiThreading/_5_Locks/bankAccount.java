package _1_engineeringDigestCoreJava._2_MultiThreading._5_Locks;
// EXPLICIT LOCKS
// try lock --> a) w/o time  b) with time
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankAccount {
    private double balance = 500;

    private double amount;

    private final Lock lck = new ReentrantLock(); //ReentrantLock ek class hai jo implement kar rahi hai Lock Interface ko.
//  Humne uper ye Lock ka object bana diya hai, and ese koi change naa kare ese final bana do

    public void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);
        try {
//            lck.lock(); // yaha thread wait karta rahega ki use lock milega.
            if (lck.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    try{ // ye try esliye dala taaki thread.sleep me agar koi exception aaye to handle ho jaaye
                        System.out.println(Thread.currentThread().getName() + " is proceeding with withdrawl.");
                        Thread.sleep(1000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed Withdrawl, Remainign Balance is : " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // ese hatake , InterruptedException me sonar lint se padh liyo
                    }finally {
                        lck.unlock(); //ese finally me esliye dala taaki har baar execute hone ke baad threads lock ko release kar de.
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // It is a good practice. ab us interrupted thread ke saath kaam bhi kar sakte hai.
            // agar hum ye nahi likhte to hum interrupted thread ki state kho dete.
        }
        if(Thread.currentThread().isInterrupted()){ // yaha hum usi interrupted thread se related kuch bhi code likh sakte hai,
//            jaise ki koi maintenance code, cleanUp code, etc
            System.out.println("");
        }
    }
}