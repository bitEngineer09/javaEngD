package CollectionFramework.one_ListInterface.Vector;
// vector me Thread vala eg dekh liyo
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(); // byDefault Initial Capacity is 10

        Vector<Integer> vector1 = new Vector<>(11); // khud se bhi capacity daal sakte hai
        // capacity bharne par 2x size badhta hai, so hum khud bhi capacityIncrement daal sakte hai

        Vector<Integer> vector2 = new Vector<>(5,3);

        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);

//      Vector me hamare pass capacity check karne ka bhi method hai
        int capacity1 = vector2.capacity();
        System.out.println(capacity1);

        vector2.add(1);
        System.out.println(vector2.capacity());


// -------------passing collections in its constructor-----------------------
//  1)  Vector<Integer> vector3 = new Vector<>(Arrays.asList(23,43,54,25,15));

//  2)  LinkedList<Integer> list = new LinkedList<>();
//      list.add(100);
//      list.add(200);
//      list.add(300);
//      list.add(400);
//      Vector<Integer> vector4 = new Vector<>(list);
//      System.out.println(vector4);


    }
}
