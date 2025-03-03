package CollectionFramework.MapInterface.HashMaps;
// in hashMap order maintain nahi rehta hai
// values can be null but keys can have only one null

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();   // eske constructor me (initial capacity, load factor) pass kar sakte hai

//      HashMap<Integer, String> map = new HashMap<>(16, 0.75f);   // ye byDefault values hai

//      Map<Integer, String> map = new HashMap<>();  // Map is parent class

        map.put(1, "Gautam");  // bina kisi order ke bhi dal sakte hai
        map.put(2, "Anish");
        map.put(3, "Sujit");

//      map.put(null, "Aman");  // ek null to daal sakte hai
//      map.put(null, "Ajit");  // dusra daalte hee humne internally use replace hee kar diya, to bacha to vahi null

        map.remove(2);  // key daalte hai
        map.remove(null, "Aman");

        System.out.println(map);

        String s = map.get(3);  // key pass karte hai
        System.out.println(s);

        System.out.println(map.get(69));  // null

        boolean b = map.containsKey(1);

        boolean c = map.containsValue("Anish");
        System.out.println(c);

//--------------loops---------------------------------------------------
        Set<Integer> keys = map.keySet();  // humne set esliye use kiya coz,
        // set bhi ek list hee hai, but it stores only unique values
        // And keys bhi to unique hee hoti hai, therfore set me store karke loop chalaenge

        for (int name : keys) {
            System.out.println(map.get(name));
        }


// Another Way
//        for (int naam : map.keySet()) {   // directly map.keySet hee likh do
//            System.out.println(map.get(naam));
//        }

//Another Way
        Set<Map.Entry<Integer, String>> entries = map.entrySet();  // ye bht saari entries ka collection bana dega

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }

        for (Map.Entry<Integer, String> a : entries) { // for uppercase
            a.setValue(a.getValue().toUpperCase());
        }

        System.out.println(map);

    }
}
