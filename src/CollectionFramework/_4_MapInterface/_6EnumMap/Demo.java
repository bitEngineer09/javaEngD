package CollectionFramework._4_MapInterface._6EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Mangalwar"); // TUESDAY(KEY) map ho gayi hai "Mangalwar" (Value) se.
        map.put(Day.MONDAY, "Somwar");
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map);

        String s = map.get(Day.MONDAY);
        System.out.println(s);

        // 1) Insertion Order maintain hota hai.
        // 2) yaha koi rb tree nahi hoga, naahi koi collision hoga, naahi koi linkedList hoga,
        //    naahi ko hashCode niklega
        // 3) Internal array get created of size same as Enum (Here in this eg will be 7).
        // 4) No hashing
        // 5) ordinal / index is used
        // 6) Faster than Hash Map.
        // 7) Also Memory Efficient.
    }
}

enum Day {
    // ye values as a KEY kaam karengi
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
