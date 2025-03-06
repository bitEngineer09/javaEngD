package CollectionFramework._7_Queue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class _9_PriorityBlockingQ {
    public static void main(String[] args) {

        BlockingQueue<Integer> q = new PriorityBlockingQueue<>();
        BlockingQueue<Integer> q1 = new PriorityBlockingQueue<>(15, Comparator.reverseOrder());

        // * by default initial capacity: 11

        // * same as priority queue, Binary Heap use hoti hai

        // * Array ki form me Binary Heap Store hoti hai (Binary Heap as Array) and can grow dynamically.

        // * Head is based on their natural ordering or a provided comparator like priority queue.
        //   (cheeze sorted nahi hoti, lekin head priority ke base pe rakha hoga)

        // * Unbounded , therefore put won,t block kyuki limit nahi aaegi.

    }
}