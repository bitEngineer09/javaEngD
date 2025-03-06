package CollectionFramework._7_Queue;

// each insert operation must wait for a corresponding remove operation by another thread and vice versa.

// ek insert hone ke baad tab tak insert nahi hoga jab tak pehla vala remove naa ho jaaye

// means it cannot store elements, Capacity is at most 1.

// in this eg -> jab producer ne transfer kiya, to hee comsumer ne consume kiya.

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class _10_SynchronousQueue {
    public static void main(String[] args) {

        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello form the producer!");
                System.out.println("Producer has transferred the message.");
            }
            catch (Exception e){
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted.");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String msg = queue.take();
                System.out.println("Consumer received: " + msg);
            }
            catch (Exception e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");

            }
        });

        producer.start();
        consumer.start();

    }
}
