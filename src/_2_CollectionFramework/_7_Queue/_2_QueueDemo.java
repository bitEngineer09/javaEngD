package _2_CollectionFramework._7_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _2_QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int size = queue.size();
        System.out.println(size);

//        queue.remove(); // throws Exception if empty
//        queue.poll();   // but ye nahi karega : o/p = null

//        queue.element(); // throws Exception if queue is empty
//        queue.peek();    // but ye nahi karega : o/p = null

    }
}
