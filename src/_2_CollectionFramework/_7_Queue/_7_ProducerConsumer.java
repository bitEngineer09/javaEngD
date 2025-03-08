package _2_CollectionFramework._7_Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;  // shared queue
    private int value = 0;

    public Producer (BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer is producing: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            }
            catch (InterruptedException i) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }
    }
}


class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer is consuming: " + value);
                Thread.sleep(2000);  // consumer ek baar consume karne ke baad 2sec ruk ra hai, to producer ko time mil jata hai produce karne ke liye.
            }
            catch (InterruptedException i) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


public class _7_ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }
}
