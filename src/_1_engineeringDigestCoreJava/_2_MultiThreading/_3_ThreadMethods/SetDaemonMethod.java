package _1_engineeringDigestCoreJava._2_MultiThreading._3_ThreadMethods;
// DAEMON THREADS --> Those threads that run in background.
// enka jvm wait nahi karta ki ye khatam ho or mai terminate ho jaau.

// USER THREADS --> Those threads that do our work, esme jvm terminate nahi hoga jab tak kaam pura naa ho jaaye

public class SetDaemonMethod extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello World !");
        }
    }

    public static void main(String[] args) {
        SetDaemonMethod t1 = new SetDaemonMethod();
//        t1.start(); // abhi ye hello print karte rahega kyuki user thread hai and loop infinite hai
        t1.setDaemon(true);
        t1.start();
        System.out.println("main Done"); // ab kuch baar hee chalega and stop ho jaaega

        SetDaemonMethod t2 = new SetDaemonMethod();
        t2.start(); // jvm terminate nahi hoga es case me
    }
}
