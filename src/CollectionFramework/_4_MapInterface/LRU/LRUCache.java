package CollectionFramework._4_MapInterface.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    // LRUCache ek class banayi hai jise fir LinkedHashMap se extend karvaya hai

    private int capacity;

    public LRUCache (int capacity) {
        super(capacity, 0.75f, true);  // super me parent class ka constructor call hoga
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
           // ye method LinkedHashMap class ka hai
        return size() > capacity;   // agar ye true return hoga then eldest(jo entry insertion order me sabse purani hogi) entry remove kar dega
    }


    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LRUCache<>(3);
        map.put("Raj", 40);
        map.put("Aman", 20);
        map.put("Ishita", 80);  // yaha tak kuch remove nahi hoga coz capacity is 3
        map.put("Praful", 70);  // ye likhne ke baad Eldest(Aman) remove ho jaega

        map.get("Aman");  // ye teen step karne ke baad pehle to LRU element uper jaaega
        map.get("Raj");   // get ek tarah se use karna hee hota hai
        map.get("Aman");

        System.out.println(map);
    }
}
