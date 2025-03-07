package CollectionFramework._8_Iterable;
// NOTE -> Agar koi bhi class iterable ko extend karti hai, to functionality aa jaati hai iterable ki

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // ArrayList class implements List interface
        // List interface extends Collections
        // Collections extend Iterable

//        for (int i: list) {
//            System.out.println(i);
//        }

        //   Internally ye chalta hai
        // Iterator is a Interface

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//    }

//--------------.remove()-------------------------
            List<Integer> ls = new ArrayList<>();
            ls.add(23);
            ls.add(25);
            ls.add(12);
            ls.add(45);
            ls.add(26);
//            for (Integer i: ls) {
//                if (i % 2 == 0) {   // This gives Concurrent Modification
//                    ls.remove(i);
//                }
                System.out.println(ls);
//            }

            Iterator<Integer> itr = ls.iterator();
            while (itr.hasNext()) {
                Integer number = itr.next();
                if (number % 2 == 0) {
                    itr.remove();  // loop karte karte usne remove kar diya, esliye Exception nahi aya
                }
            }
        System.out.println(ls);
        }
    }

