package CollectionFramework._4_MapInterface._7ImmutableMap;

// Map whose content we can't change once it is instantiated.
// We can't able to add, update, remove.

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 10);
//        map1.put("B", 20);
//
//        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
//
//        map2.put("C", 30); // yaha se to hum change nahi kar sakte (Throws: UnsupportedOperationException), but
//        map1.put("C", 30); // ye kar sakte hai. It is bad practice, So ImmutableMap aya

        Map<String, Integer> map3 = Map.of("A", 20, "B", 20, "C",40);
//      Note -> Limitation -> Holds only 10 Key, Value pairs.
//      Insertion Order is not maintained.
        System.out.println(map3);
//      map3.put("D", 50); // UnsupportedOperationException

        // Jyada entries ke liye ye hai
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("A", 10), Map.entry("B", 20), Map.entry("C", 30));
        System.out.println(map4);
    }
}
