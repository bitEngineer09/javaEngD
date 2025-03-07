package CollectionFramework._8_Iterable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _2_ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(60);
        list.add(0);

        ListIterator<Integer> lst = list.listIterator();
          // ListIterator extends iterator
          // esme or bhi methods aa jate hai, explore kar liyo


    }
}
