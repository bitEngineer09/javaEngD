package CollectionFramework._4_MapInterface._2SortedMapTwo.NavigableMap;
// 1) NavigableMap extends SortedMap, providing
//   more powerful navigation options such as
//   finding the closest matching key or retrieving
//   the map in reverse order.

import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(12, "Beer");
        map.put(9, "Gaanja");
        map.put(30, "Bhaang");
        map.put(24, "heroin");

        System.out.println(map.lowerKey(30)); // closest lower key from 30
        System.out.println(map.ceilingKey(9)); // closest upper key from 9
        System.out.println(map.ceilingKey(10)); // closest upper key from 10
        // agar key same hai to vhai key reutrn hogi, and agar key nahi hai to uske aage peeche vali values kaam karengi

        System.out.println(map.higherEntry(9));  // 12=Beer

        System.out.println(map);  // byDefault descending me print hoga
        System.out.println(map.descendingMap()); // ulta print karva dega

    }
}
