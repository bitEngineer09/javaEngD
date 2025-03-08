package _1_engineeringDigestCoreJava.EDcollectionframework;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(map);

    }
}
