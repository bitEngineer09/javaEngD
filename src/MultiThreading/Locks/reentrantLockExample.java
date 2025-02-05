package MultiThreading.Locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantLockExample {

    public final Lock lck = new ReentrantLock();
//  yaha outer method ne lock acquire kiya,
//  then innerMethod call hua, fir vo same lock ko acquire karne ki koshih kar ra hai
//  this is a DEADLOCK condn.
//  but as here is reentrant implementation class, then innerMethod again usi lock ko acquire kar sakta hai.
//  reentrant matlab fir se enter.
//  jab reentrant lock use karte hai, to ek count maintain kiya jata hai
//  matlab ki lock kitne baar acquire kiya gaya hai.
//  agar extra unlocks laga diye to exception bhi aaega.

    public void outerMethod() {
        lck.lock(); // 1) count - 1
        try {
            System.out.println("Outer Method");
            innerMethod();
        }
        finally{
            lck.unlock(); // 4) count - 0
        }
    }

    public void innerMethod(){
        lck.lock(); // 2) count - 2
        try{
            System.out.println("Inner Method");
        }
        finally {
            lck.unlock(); // 3) unlock hoke -> count - 1 hoga naaki 0
//           agar hum yaha first unlock likh de to lock completely unlock ho jaaega.
        }
    }

    public static void main(String[] args) {
        reentrantLockExample example = new reentrantLockExample();
        example.outerMethod();
    }
}
