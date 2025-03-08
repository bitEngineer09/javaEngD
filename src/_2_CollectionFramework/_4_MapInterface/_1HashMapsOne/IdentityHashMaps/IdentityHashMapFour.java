package _2_CollectionFramework._4_MapInterface._1HashMapsOne.IdentityHashMaps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapFour {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        // HashCode and equals
        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 1);  // key, 1
        map.put(key2, 2);  // key, 2
        System.out.println(map); // o/p -> {key=2}

        System.out.println(key1.hashCode()); // 106079
        System.out.println(key2.hashCode()); // 106079

//  1) pehle key ka hascode generate hoga, then index milega then use patak dega
//  2) dusre key ka hashcode generate hoga, then index milega fir use bhi kisi location pe patak dega
//  3) fir dekhega ki us index pe pehle se hee rakha hua hai
//  4) fir check karega ki us index pe jo pehle se hai, or jo hum rakhne jaa re hai, kahi vo equal to nahi hai
//  5) agar equal nahi hai it means collision hoga, vo linkedList me dalega
//  6) and agar equal hua to key ki value replace hogi.

        // * equals aise check kiya jata hai
//        System.out.println(key1.equals(key2)); // true coz key1 and key2 are equal i.e, key




        String key3 = new String("key");  // yaha new hai esliye obj vala unique hashCode banega
        String key4 = new String("key");  // yaha new hai esliye obj vala unique hashCode banega

        // NOTE--> new karne se do string ke obj banenge alag alag locations par

        Map<String, Integer> map1 = new IdentityHashMap<>();
        // IdentityHashCode and ==
        // agar == true ata hai means same address hai to replace kiya jaaega
        // agar == false hai to new entry hogi
        map1.put(key3, 3);
        map1.put(key4, 4);
        System.out.println(map1);

        System.out.println(System.identityHashCode(key3));  // 2065951873
        System.out.println(System.identityHashCode(key4));  // 1791741888

//  1) chahe hamari class me hashcode ho yaa naa ho, IdentityHashMap me obj ka hashCode hee chalega
//  2) hume pata hai ki String me khud ka hashCode likha hai, lekin identity hashMap ko usse matlab hee nahi hai.
//  3) Identityhashmap me to object ke ander jo hashCode likha hota hai, jisme meory address ke saath khelte hai, vo use hoga
//  4) Suppose hashcode same aa jata hai, tab bhi equals method nahi chalta
//  5) yaha equaltiy check hoti hai ref address ki by ==

    }

}
