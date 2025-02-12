package engineeringDigestCoreJava.collectionframework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17,0.5f);
        map.put(31, "Shubham");
        map.put(11, "Akshit");
        map.put(2, "Neha");
        map.put(2, "Mehul");
        System.out.println(map);

        String student = map.get(31);
        System.out.println(student);
        String s = map.get(69);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Shubham"));

        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

//        map.remove(31);
        boolean res = map.remove(31, "Nitin");
        System.out.println("REMOVED ? :" + res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        list.contains(32);
    }
}
