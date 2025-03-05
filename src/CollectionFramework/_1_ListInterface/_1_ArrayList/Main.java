package CollectionFramework._1_ListInterface._1_ArrayList;

// NOTE --> COLLECTIONS ME HUM LHS ME JO BHI CLASS DAALENEGE USI KE METHODS CHALENGE

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//      ArrayList arraylist = new ArrayList();   this is a generic class therefore type safety maintain karni hogi

        ArrayList<Integer> arraylist = new ArrayList<>();  // eske constructor me collection/ capacity pass kar sakte hai

//      List<Integer> arraylist = new Arraylist<>();  list parent class hai therefore it is also correct, and eske liye List class import karna padega

        arraylist.add(2); // aise list ke last me add ho ra hai
        arraylist.add(1,3); // 1 index pe 3 add karna hai
        arraylist.add(7);

//        System.out.println(arraylist.get(0));

//        System.out.println(arraylist.size());

//        System.out.println(arraylist.contains(7));

        arraylist.remove(2); // index daalte hai

        arraylist.set(1, 100); // esme element replace hota hai naaki khisakta hai as in case of add

//        System.out.println(arraylist); // w/o loop bhi print kar sakte hai, kyuki ye toString method chalata hai



//----------------Printing lists-------------------------------------------------------------

//        for (int i = 0; i < arraylist.size(); i++) {
//            System.out.println(arraylist.get(i));
//        }

//        for (int i : arraylist) {
//            System.out.println(i);
//        }



//---------------------Next Concept--------------------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>(100); // ye humne initial capacity de diya hai kyuki jab bhi hum extra elements add karte hai to size 1.5x badhta hai that leads
                                                                    // to unusual space, therfore humne pehle hee uski capacity declare kar di
//  NOTE --> Agar hum 100 se jyada elements daal dete hai to capcity fir 1.5x badh jaaegi

//        System.out.println(list.size()); // ye 100 nahi 0 hee aaega kyuki abhi tak humne
                                         // kuch dala nahi hai, 100 is capacity not the size

//  NOTE --> Aisa koi method nahi hai jisse hum capacity dekh paaye



//---------------------Ways of creating ArrayList---------------------------------------------------------

//  1)      ArrayList<Integer> list = new ArrayList<>();

//  2)      List<Integer> list0 = new ArrayList<>();
//        System.out.println(list0.getClass().getName());   // o/p -> java.util.ArrayList


//  *      agar on the flight create karna hai then, also esme hum add nahi kar sakte elements ko, but replace kar sakte hai
//  3)      List<Integer> list1 = Arrays.asList(1, 2, 3);   // asList, list return karta hai
//          List<String> list2 = Arrays.asList("Sohan", "Mohan");

//  -->Wrong  ArrayList<Integer> list1 = Arrays.asList(1,2,3);  // yaha ArrayList nahi likh sakte coz asList Parent return kar ra hai i.e, List


//  4)      String[] array = {"Mohan", "Shyam", "Dubey"};
//        List<String> list3 = Arrays.asList(array);

//        System.out.println(list3);
//        System.out.println(list3.getClass().getName());  // o/p -> java.util.Arrays$ArrayList
//        list3.set(1,"Apple");
//        System.out.println(list3);

//  5)    List<Integer> list5 = List.of(1,23,45); // This is unmodifiable list, yaha replace bhi nahi kar sakte
//        System.out.println(list5);
//        list5.set(1, seb);  cannot be done



//------------------To make list modifiable-------------------------------------

//        List<Integer> list6 = new ArrayList<>(list5);
//        list6.add(68);
//        list6.remove(1);
//        System.out.println(list6);


//------------------Some Methods-----------------------------------------------------

//  addAll
        List<Integer> list7 = new ArrayList<>();
        list7.add(8);
        list7.add(9);
        List<Integer> list8 = List.of(1,2,3,4,5,6,7);

        list7.addAll(list8);
        System.out.println(list7);

//  Removing by values
        list7.remove(Integer.valueOf(9));
        System.out.println(list7);


//  Converting List to Array
        Object[] array = list7.toArray();

        Integer[] array1 = list7.toArray(new Integer[0]);  // Integer[0] is convention, Humne yaha integer type
                                                           // ki array banayi hai therefore Integer Likha hai

//  Sorting Collections
        Collections.sort(list7);  // collections class hai, and import karna padta hai ese
        list7.sort(null);  // other way













    }
}
