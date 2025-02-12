package engineeringDigestCoreJava.MultiThreading.threadCommunication;
// hum chahte hai ki producer data produce kare, but agar hasData true hai to wait karega
// and consumer data consume kare only agar hasData true hai.

class SharedResource {
    private int data;

    private boolean hasData;

    public synchronized void produce(int value){
        while (hasData) { // ye tab chalega jab suppose buffer me data pehele se hee ho, to pruduce hee kyu karna
            try {
                wait(); // ye method use karne ke liye synchronized banana hoga
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // it restores its state.
//                throw new RuntimeException(e);
            }
        }

        data = value; // matlab ki data hai already hai.
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // notify karega dusre Threads ko ki consume karo
    }

    public synchronized int consume() {
        while (!hasData){
            try {
                wait();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false; // jab data consume karne ke liye nahi hoga
        System.out.println("Consumed: " + data);
        notify(); // then ye producer ko bolega ki wait karna band karo,
                  // kyuki hasData false aa gaya hai, and ab produce karo
        return data; // eska matlab ki data hai to consume karao
    }
}

class Producer implements Runnable {
    private SharedResource resource; // ek field hai SharedResource ki

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            resource.produce(i); // 0 to 9 data produce karana hai
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource)); // producer and consumer Runnable ki implementation class hai,
                                                                    // humne yaha directly create karke Thread me de diya
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }

}
