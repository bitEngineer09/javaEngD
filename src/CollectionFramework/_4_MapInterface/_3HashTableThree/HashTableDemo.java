package CollectionFramework._4_MapInterface._3HashTableThree;

import java.util.Hashtable;

// 1) ye jdk 1.0 me bhi tha jab collections nahi aya tha
// 2) Hashtable is synchronized.
// 3) It implements map.
// 4) no null key or value
// 5) a legacy class, but ab ese use nahi karte kyuki ye
//    replace ho gayi hai ConcurrentHashMap se.
// 6) Hashtable is slower than HashMap due to synchronized coz of overhead.
// 7) only LinkedList in case of Collision.
// 8) All methods in hashtable are synchronised


// NOTE --> hashMap me ek ThreshHold unit paar karne ke baad RB tree use hota hai

public class HashTableDemo {
    public static <HashTable> void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        // vahi sab methods hai check kar liyo
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put (3, "Cherry");
        System.out.println(map);

        map.remove(2);
//        map.put(null,"value"); // throws Exception
//        map.put(34, null);     // throws Exception
    }
}
