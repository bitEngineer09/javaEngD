package CollectionFramework._4_MapInterface.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//  LRU (Least Recent Used) ek mechanism jisme hum ye pata karte hai ki konsa element bht kam use hua hai
//  jo element kam use hota hai vo uper aa jata hai

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 07, true);
        map.put("Apple", 100);
        map.put("Grapes", 120);
        map.put("Kiwi", 50);

        map.get("Apple");
        map.get("Grapes");
        map.get("Grapes");
        map.get("Kiwi");
        map.get("Apple");
        map.get("Grapes");

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            System.out.println(entries.getKey() + ": " + entries.getValue());
        } // kiwi sabse uper aa jaaega

    }
}
