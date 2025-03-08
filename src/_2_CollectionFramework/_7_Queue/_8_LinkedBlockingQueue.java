package _2_CollectionFramework._7_Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class _8_LinkedBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new LinkedBlockingQueue<>();

        // * agar capcity de do to badhiya, nahi to INTEGER.MAX_VALUE set ho jaaegi
        // * optionally bounded.
        // * Do bounding (RECOMMENDED)
        // * unbounded chhordne me OutOfMemoryError aa sakti hai, so it is risk.
        // * uses two separate locks for enqueue and dequeue operations
        // * Higher concurrency b/w producers and consumers
        // * USE CASE: MORE THREADS

    }
}
