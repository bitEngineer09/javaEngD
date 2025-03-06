package CollectionFramework._7_Queue;

// 1) part of a queue Interface
// 2) orders elements based on their natural ordering (for primitives lowest first).
// 3) queue ka ek basic concept hota hai ki top element pe jo hai vo hume chaiye, hume matlab nahi hai ki ander kya hai,
// head pe jo hoga uski sabse jyada priority hoti hai.
// 4) custom comparator for customised ordering
// 5) does not allow null elements

// Note --> Esme apne aap natural order sorting hoti hai, jiski vajah se head pe most priority vala item aa jaaega.

// NOTE --> MinHeap ek binary tree hota hai, in which each parent node is less than equal to its child node.
import java.util.PriorityQueue;

public class _4_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(34);
        queue.add(56);
        queue.add(10);
        queue.add(15);
        System.out.println(queue);

        System.out.println("first element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

//------------------INTERNAL WORKING--------------------------

        // 1) PriorityQueue is implemented as a min-heap by default (for natural ordering).
        //    min-heap ki vajah se smallest element top pe aajata hai.

        // * EXTRACT Top element: O(1)
        // * REMOVE TOP element: O(log n)
        // * INSERTING: O(log n)

//------------------Comparator---------------------------
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> y - x);  // Descending
        PriorityQueue<Integer> q1 = new PriorityQueue<>((x, y) -> x - y); // Ascending


    }
}
