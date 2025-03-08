package _1_engineeringDigestCoreJava._2_MultiThreading._4_Synchronization;
// synchronized can be methods, yaa fir synchronized blocks bhi hote hai.

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();     // do thread hai, dono me common resource hai counter, dono me ek hee obj share ho rakha hai
        t2.start();
        try {
            t1.join();  // ye dono pura execute hone ke baad hee main thread execute hoga.
            t2.join();
        }catch (Exception e){

        }

        System.out.println(counter.getCount()); // agar join nahi karate to kisi ek hee instance pe ye print hota
//  1)  Ideally ek thread 0 - 1000 chalega, and dusra thread fir 1000 - 2000 chalega.
//      But aisa nahi hoga, kyuki kuch aise cases honge jinme dono thread ek saath chalenege and increament honge
//      es vajah se surity nahi hai ki 2000 aaye.

//  2)  To mske sure that, jab ek thread koi method access kar raha hoga to dusra,
//      thread wait karega ki kab vo complete ho jaaye.
//  3)  To achieve this make that method synchronized.
    }
}
