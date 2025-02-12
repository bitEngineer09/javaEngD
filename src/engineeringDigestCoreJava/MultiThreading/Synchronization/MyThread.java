package engineeringDigestCoreJava.MultiThreading.Synchronization;

public class MyThread extends Thread {

    private Counter counter; // yaha ye, thread me ek field hai counter type ki

    public MyThread(Counter counter){ // counter as an argument liya jaaega es constructor me
        this.counter = counter;     // counter ki vo value set karo jo Constructor me pass hogi

    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
