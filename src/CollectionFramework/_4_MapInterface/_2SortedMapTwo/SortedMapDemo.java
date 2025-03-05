package CollectionFramework._4_MapInterface._2SortedMapTwo;
// Sorted Map is an Interface extends Map.
// Tree map is its implementation.
// Tree Map is also implementation of Navigable Map
// Tree Map me iternally RB tree hota hai.
// RB tree is a self balancing binary search tree.
// cheezo ko agar on the basis of keys sort karenge to use karenge sorted Map.


import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();

//        Map<String, Integer> map1 = new TreeMap<>();
        // Map parent class hai, therfore vo bhi likh sakte hai, to sorted map ki
        // jarurat esliye padi coz it has another special methods

        map.put("Aman", 20);
        map.put("Gajendra", 90);
        map.put("Bhogendra", 30);
        map.put("Mahendra", 10);

        System.out.println(map); // alphabetical order me print hoga due to sorted map
                                 // agar key integer hoti to ascending order me print hoti

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Gajendra"));  // Gajendra tak ka data dega ("Gajendra will be excluded")
        System.out.println(map.tailMap("Bhogendra"));  // Bhogendra se aage ka data dega ("Bhogendra is included")
        // or bhi methods hai check kar le


        // in descending Order
        SortedMap<Integer, String> map2 = new TreeMap<>((a,b) -> b - a);
        map2.put(99, "Gautam");
        map2.put(230, "Sujit");
        map2.put(97, "Aman");
        map2.put(20, "Kamlesh");

        System.out.println(map2);
    }
}
