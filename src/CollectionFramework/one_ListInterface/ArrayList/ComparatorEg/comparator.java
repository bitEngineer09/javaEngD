package CollectionFramework.one_ListInterface.ArrayList.ComparatorEg;

// Comparator is an Interface by which we can do custom ordering
// we need to implement Comparator interface
// Comparator ek FunctionInterface, jise implement karne ke liye ek implementation class banani padti hai


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();

        // s1     s2
        // "ok"  "bye"
    }
}

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
        // negative return me i1 - i2 me ascending order aaega
        // positive return me i2 - i1 me descending order aaega
        // 0 return me same preferance hoga

        // NOTE -> Ascending me jaise aaye hai vaise hee minus kar do, descending me ulta kar do
    }
}

public class comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(50);
        list.add(1);
        list.add(19);

//        list.sort(null); // null matlab natural order me sort karega, i.e., descending order
        list.sort(new IntegerComparator());
        System.out.println(list);

        List<String> name = Arrays.asList("Sonu","Gautam", "Amannnn");
//        name.sort(null);
        name.sort(new StringLengthComparator());
        System.out.println(name);



//----------------By Lambda-------------------------------
        list.sort((a, b)-> b - a);
        System.out.println(list);

        name.sort((a, b)-> a.length() - b.length());
        System.out.println(name);
    }
}
