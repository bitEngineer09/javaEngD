package _2_CollectionFramework._7_Queue;

import java.util.LinkedList;

public class _1_LinkedListAsQueue {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);  // elemts ko daalne ko enqueue bolte hai
        list.addLast(20);  // enqueue (as push operation in stack)
        list.addLast(30);  // enqueue
        list.addLast(40);  // enqueue
        list.addLast(50);  // enqueue
        list.addLast(60);  // enqueue

        /*
            [10, 20, 30, 40, 50, 60]
             0   1   2   3   4   5
            10 first add hoga, then vahi pehle niklega
         */

        System.out.println(list);

        Integer i = list.remove(0);  // dequeue
        Integer j = list.remove(1);  // dequeue
        System.out.println(i);

        final Integer first = list.getFirst();
        System.out.println(first);  // peek

        final Integer peek = list.peek();
        System.out.println(peek);   // peek
    }
}
