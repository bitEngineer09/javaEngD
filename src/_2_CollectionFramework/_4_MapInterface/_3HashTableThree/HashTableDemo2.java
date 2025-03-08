package _2_CollectionFramework._4_MapInterface._3HashTableThree;

import java.util.Hashtable;

public class HashTableDemo2 {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                map.put(i, "Thread1");
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 1000; i < 2000; i++) {
//                map.put(i, "Thread2");
//            }
//        });
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        }
//        catch (InterruptedException i) {
//            i.printStackTrace();
//        }
//        System.out.println(map.size());
        // eska o/p 2000 but nahi aaega coz HashMap is not ThreadSafe.
        // aisa bht baar hua hoga ki ek time pe bht threads ek saath chal gaye honge.


        // Now use HashTable


        Hashtable<Integer, String> map = new Hashtable<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException i) {
            i.printStackTrace();
        }
        System.out.println(map.size());

        //ab o/p 2000 aaega, as it is Thread-Safe
        // Note-> All methods in hashtable are synchronised
    }
}
