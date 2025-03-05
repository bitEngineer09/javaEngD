package CollectionFramework._6_Set;
import java.util.*;
public class WhyDontUseSynchronized {
    public static void main(String[] args) {

        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
//  as ye method synchronized block me set ke sabhi methods ko wrap kar deta hai, therfore agar ab hume iteration bhi karna pade to use synchronized block me daalna padta hai
//  so not recommended.
        synchronized (syncSet) {
            for (Integer i : syncSet) {
                System.out.println(i);
            }
        }
    }
}
