package _1_engineeringDigestCoreJava._2_MultiThreading._1_ThreadCreate;

public class creatingThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1(); // ek thread ka obj banaya hai (New State)
        thread1.start();      // start method initiates the new thread (RUNNABLE State)

//        for(; ;) {
//            System.out.println(Thread.currentThread().getName());
//        }
        Thread2 thread2 = new Thread2();
        Thread t2 = new Thread(thread2); // way of initializing thread by implemets runnable
        t2.start();
    }
}
