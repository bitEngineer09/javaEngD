package CollectionFramework._6_Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

// faster operations.
// no duplicate values.
public class _1_Demo {
    public static void main(String[] args) {

//  Note --> Map ki jo keys hai vo ek tarah se key ka set hee hota hai
//  Map<String, Integer> map = new HashMap<>();
//  Set<String> set1 = map.keySet(); // ye hum keys ka set hee to bana re hai
//-------------Hash Set------------------------------------------------
        Set<Integer> set = new HashSet<>();
        set.add(45);
        set.add(2);
        set.add(1);
        set.add(9);
//   Insertion order is not maintained.
        System.out.println(set);


//---------------Linked Hash Set-------------------------------------------
//   To maintain order use Linked-Hash-Set, esme internal wroking same hai, bass linkedList aa jaati hai
        Set<Integer> set1 = new LinkedHashSet();
        set1.add(34);
        set1.add(90);
        set1.add(12);
        set1.add(0);

        System.out.println(set1);
        System.out.println(set1.contains(34));

        for (int i : set1) {
            System.out.println(i);
        }

        set1.clear();
        set1.isEmpty();

//---------------Tree Set-----------------------------------------------------------
// To get things in Sorted manner use TreeSet
        Set<Integer> set2 = new TreeSet<>();
        set2.add(23);
        set2.add(12);
        set2.add(20);

        System.out.println(set2);


//-------------------Navigable Set-----------------------------------
//   Tree Set implements navigable Set

        NavigableSet<Integer> set3 = new TreeSet<>();
        // esse or methods unlock ho jaaenge
        set3.add(23);
        set3.add(12);
        set3.add(20);

        set3.floor(23);
        set3.ceiling(43);
        // or methods explore kar liyo

//-----------Thread Safe---------------------------------------
        Set<Integer> set4 = new HashSet<>();
        set4.add(23);
        set4.add(12);
        set4.add(20);

        // kisi bhi set ko yaa map ko hum khud se bhi thread safe kar sakte hai
        Set<Integer> set5 = Collections.synchronizedSet(set4); // ab jo set5 bana hai vo synchronized hai
        // synchronizedSet given set yaa map ko synchronized block me wrap kar deta hai.
        // but ye thoda complex hota hai esliye use nahi karte

        // So we ConcurrentSkipListSet, It implements navigable set.

        ConcurrentSkipListSet<Integer> set6 = new ConcurrentSkipListSet<>();

        Set<Integer> set7 = new ConcurrentSkipListSet<>();

        NavigableSet<Integer> set8 = new ConcurrentSkipListSet<>();

        SortedSet<Integer> set9 = new ConcurrentSkipListSet<>();


//----------------Unmodifiable Set-----------------------------
        Set<Integer> unmodifableSet = Set.of(1,2,3,4,5,6); // esme 10 se jyada entries de sakte hai

        // Also
        Collections.unmodifiableSet(set6); // set pass kar do constructor me


//-----------------Enum Set padh liyo---------------------
    }
}
