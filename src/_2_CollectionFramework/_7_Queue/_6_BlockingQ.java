package _2_CollectionFramework._7_Queue;

// thread-safe queue
// wait for queue to become non-empty / wait for space.
// simplify concurrency problems like producer-consumer.

// in standard queue --> immediately operation hote hai.
    // if empty --> remove bina wait kiye immediately ho jaega.
    // if full --> add (no waiting)

// in Blocking Queue
    // put --> Blocks if the queue is full until space becomes available
    // take --> Blocks if the queue is empty until an element becomes available
    // offer --> Waits for space to become available, up to the specified timeout

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class _6_BlockingQ {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
        // * Note -> Blocking Queue implementation class hai, so hum use instantiate to kar nahi sakte.
        //         So uski implementaion class likhni padti hai, i.e, ArrayBlockingQueue.

        // * It is bounded, Capacity passing is necessary.
        // * low memory overhead.
        // * uses single lock for both enqueue and dequeue operations.
        // * if more threads honge : problem

        // * Blocking Queue ki jarurat tab padti hai, jab Threads ko coordinate karna ho ek dusre se

    }
}
