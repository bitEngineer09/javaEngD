package _2_CollectionFramework._1_ListInterface._2_LinkedList;

// linked List me values contiguous memory location me store nahi hote hai
// Therefore in case of manually creating LinkedLists hum kisi particular element
// ka index directly pata nahi kar sakte, so we use loops

import java.util.LinkedList;

public class lklist {
    public static void main(String[] args) {

        // java ne hume LinkedList class ka feature de rakha hai, so hum directly index pata bhi kar sakte hai
        // ye default doubly linkedList hota hai

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); // add nodes
        linkedList.add(2);
        linkedList.add(3);

        linkedList.get(2); // 2 index pe kya hai   ---->  O(n)
        linkedList.addFirst(11); // first index pe add hoga  ---->  O(1)
        linkedList.addLast(22);  // last index pe add hoga   ---->  O(1)
        linkedList.getFirst();
        linkedList.getLast();

        linkedList.removeIf(x -> x % 2 == 0);
        // or bhi remove ke methods hai check kar le

        System.out.println(linkedList);

    }
}
