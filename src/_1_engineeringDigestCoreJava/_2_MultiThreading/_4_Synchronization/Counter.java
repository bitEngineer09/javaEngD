package _1_engineeringDigestCoreJava._2_MultiThreading._4_Synchronization;

public class Counter {
    private int count = 0;

    public void increment(){ // ye hamare program ka vo part hai, jaha shared resources access/modify kiye jaa rahe hai
//  This part of program is called CRITICAL SECTION
// 1) ek instance jispe increment method call ho ra hai, agar usko multiple threads access kar re hai,
//    to ek baar me ek he thread access kar ra hoga.
// 2) Means ki agar hamare pass multiple objects hai counter ke to independent kaam hoga

        synchronized (this){ // this ka matlab hai ki hum ek instance ki baat kar re hai
            count++;
        } // It is synchronized block
    }

    public int getCount(){
        return count;
    }
}
