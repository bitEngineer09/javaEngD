package CollectionFramework._1_ListInterface._4_Stack;
import java.util.LinkedList;

// hum linkedList ko as a stack behave esliye kara paate hai kyuki vo doubly inked list hota hai
// we have pointer to the tail, esliye hum khel paa re hai getLast(), addLast(), etc.
// if java ki linkedList singly linkedList hoti, to hum ye nahi kar paate

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // addLast se hum stack ki tarah hee to push karva re hai
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        System.out.println(linkedList);

        linkedList.removeLast(); // as POP
        linkedList.removeLast(); // as POP
        System.out.println(linkedList);

        linkedList.getLast(); // as PEEK

        linkedList.size();
        linkedList.isEmpty();
    }
}
