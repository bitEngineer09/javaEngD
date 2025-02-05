package MultiThreading.ThreadCreate;
// 1) runnable majburi me use karte hai, agar koi class pehle hee kisi,
//    ko extends kar ri hai to Thread ko extend nahi karega, coz java doesn't supports multiple inheritance.
// 2) In this case we need to implements Runnable Interface.

public class Thread2 implements Runnable {

    public void run(){ // ye start method se call nahi hoga
        System.out.println(Thread.currentThread().getName());
    }
}
