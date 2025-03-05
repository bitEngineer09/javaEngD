package CollectionFramework._6_Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class _2_CopyOnWriteArraySet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> ArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> SkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 1; i <= 5; i++) {
            ArraySet.add(i);
            SkipListSet.add(i);
        }

        System.out.println("Initial CopyOnArraySet " + ArraySet);
        System.out.println("Initial ConcurrentSkipListSet " + SkipListSet);

        for (Integer num : ArraySet) {
            System.out.println("Reading from ArraySet: " + num);

            ArraySet.add(6); // yaha 6 show nahi hoga kyuki photo pe kaam chalega
        }

        System.out.println(ArraySet);  // final o/p bahar dikhega


        for (Integer num : SkipListSet) {
            System.out.println("Reading from SkipListSet: " + num);

            SkipListSet.add(6); // es case me hume 6 mil sakta hai and nahi bhi
            // ConcurrentSkipList weakly consistent hota hai, hume pata nahi ki hamari cheeze achhi dikhengi yaa nahi.
        }
// Note-> Sabke apne apne useCases hai, us hisaab se use karna hota hai

        // * Write operation kam honge to use karte ai CopyOnArraySet, coz agar jyada write rahe to jyada copy banegi, jyada memory use hogi.
        // * For iteration And stabilty then use this.

        // * Frequent read & writes : use ConcurrentSkipListSet.
    }
}
