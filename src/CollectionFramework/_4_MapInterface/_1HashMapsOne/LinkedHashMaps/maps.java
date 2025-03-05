package CollectionFramework._4_MapInterface._1HashMapsOne.LinkedHashMaps;

// LinkedHashMap extends HashMap.
// LinkedHashMap is class of HashMap.
// Unlike hashMap, LinkedHashMap me order maintain hota hai,
// matlab ki jis order me hum insert karenge, usi order me cheeze print hongi.
// This is Not Thread Safe

import java.util.LinkedHashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // eske constructor me bhi (initial capacity, load Factor {float}, accessOrder {boolean}) daal sakte hai
        // collections bhi pass kar sakte hai

        // LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.5f, true);
        // false --> for insertion order (default), jis order me insert kiya hai vahi milega
        // true --> for access order,
        // fir jab hum koi element get karenge then uske bad map print karenge to get vala element last me print hoga


        // It has double Linked List jo ki saari entries ko rakhti hai, jis order me humne insert kari hai
        // Due to overhead of this linked List is becomes slow in comparison to hashMap
        // It also takes a little bit more memory in comparison to hashMap

        map.put("Guava", 80);
        map.put("Apple", 100);
        map.put("Grapes", 50);

        for (Map.Entry<String, Integer> entry : map.entrySet() ) {  // Entry : Returns the key corresponding to this entry
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//  getOrDefault Method
        int res = map.getOrDefault("Guava", 0);   // 0 is here a default value
        // eska matlab ki agar HashMap me Guava key aati hai to vo return kar do
        // nahi aati hai to default value return kar do

        int res2 = map.getOrDefault("Mango", 0);
        System.out.println(res);  // o/p -> 80
        System.out.println(res2);  // o/p -> 0

//  putIfAbsent Method

        map.putIfAbsent("Mango", 40); // agar absent hai to hee put karo
        System.out.println(map);
    }
}
