package _2_CollectionFramework._7_Queue;

// 1) allows insertion and removal of elements from both ends.
// 2) versatile than regular queues and stacks because they support all the operations of both.

/*
    INSERTION METHODS

    addFirst(E e): Inserts the specified element at the front.
    addLast(E e): Inserts the specified element at the end.
    offerFirst(E e): Inserts the specified element at the front if possible.
    offerLast(E e): Inserts the specified element at the end if possible.

*/

/*
    REMOVAL METHODS

    removeFirst(): Retrieves and removes the first element.
    removeLast: Retrieves and removes the last element.
    pollFirst(): Retrieves and removes the first element, or returns null if empty.
    pollLast: Retrieves and removes the last element, or returns null if empty.

*/

/*
    EXAMINATION METHODS

    getFirst: Retrieves, but does not remove, the first element.
    getLast: Retrieves, but does not remove, the last element.
    peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
    peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
    STACK METHODS

    push(E e): Adds an element at the front (equivalent to addFirst (E e)) .
    pop(): Removes and returns the first element (equivalent to removeFirst())..

*/
public class _5_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        // * Internally yaha array hai, therefore elements contiguous memory locations pe hone, so ITERATION is easy.
        // * FASTER ITERATION
        // * low memory
        // * no null allowed

        // NOTE --> Recommended to use ArrayDeque until koi specific requirement naa ho LinkedList ki.

        // NOTE --> It uses Circular Array, in which we have two pointers head and tail.
        //          to jab elements remove karte hai to bache elements ko khiskana nhi padta, head and tail change hote hai.
        // Actually circular hota nahi hai, hum indexes ke saath khelke use circular bana dete hai.


        deque1.addFirst(10);  // 10
        deque1.addLast(20);   // 10, 20
        deque1.offerFirst(5);  // 5, 10, 20
        deque1.offerLast(25);  // 5, 10, 20, 25

        System.out.println(deque1);

        System.out.println("First Element: " + deque1.getFirst()); // Outputs 5
        System.out.println("Last Element: " + deque1.getLast()); // Outputs 25
        deque1.removeFirst(); // Removes 5
        deque1.pollLast();  // Removes 25

        // Current Deque: [10, 20]

        for (int num : deque1) {
            System.out.println(num);
        }

        Deque<Integer> deque2 = new LinkedList<>();
        // only use in case of INSERTION & DELETION in middle

    }
}
