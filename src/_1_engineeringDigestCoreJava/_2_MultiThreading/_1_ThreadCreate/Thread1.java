package _1_engineeringDigestCoreJava._2_MultiThreading._1_ThreadCreate;
// thread banane ke liye yaa to (extends Thread) or (Implements runnable interfaces)

public class Thread1 extends Thread {
    @Override
    public void run(){ // 'run' Thread class ka method hai.
        System.out.println(Thread.currentThread().getName());
    }
}

