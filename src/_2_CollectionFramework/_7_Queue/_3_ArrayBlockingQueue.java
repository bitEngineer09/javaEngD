package _2_CollectionFramework._7_Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class _3_ArrayBlockingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        queue1.add(1);
        System.out.println(queue1.add(2));

//      queue1.add(3); // capacity bharne ke badd add karnege to Exception aaega

        // so use offer()
        // * offer boolean value return karta hai
        // * add bhi boolean value return karta hai
        // true : add hua hai
        // false : add nahi hua hai

        System.out.println(queue1.offer(3));
        System.out.println(queue1.offer(4));
    }
}
