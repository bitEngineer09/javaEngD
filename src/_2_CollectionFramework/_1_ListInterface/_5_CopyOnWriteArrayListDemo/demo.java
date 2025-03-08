package _2_CollectionFramework._1_ListInterface._5_CopyOnWriteArrayListDemo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// "Copy on Write" means that whenever a write operation
// like adding or removing an element
// instead of directly modifying the existing list
// a new copy of the list is created, and the modification is applied to that copy
// This ensures that other threads reading the list while it's being modified are unaffected.

// Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
// Write Operations: A new copy of the list is created for every modification.
//                   The reference to the list is then updated so that subsequent reads use this new list.
// notepad --> notepad-copy
// When to use -> When read Operations are more

public class demo {
    public static void main(String[] args) {
//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();


//--------- ye ConcurrentModificationException dega------------------
//  yaha read ke saath hum butter write karva re the therfore exception aya

//        List<String> groceryList = new ArrayList<>();
//        groceryList.add("Eggs");
//        groceryList.add("Bread");
//        groceryList.add("Milk");
//
//        for (String items : groceryList) {
//            System.out.println(items);
//
//            if (items.equals("Bread")) {
//                groceryList.add("Butter");
//                System.out.println("Added butter while reading");
//            }
//        }
//
//        System.out.println("Final list is: " + groceryList);


//--------------SOLUTION--------------------------
// In this case ab exception nahi aaega kyuki dusri copy pe kaam hua hai
// Read and Write same time pe kar sakte hai, snapshot pe kaam hota hai
// Read ek photo pe hoga and write dusre photo pe hoga

        List<String> groceryList = new CopyOnWriteArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Bread");
        groceryList.add("Milk");

        for (String items : groceryList) {
            System.out.println(items);

            if (items.equals("Bread")) {
                groceryList.add("Butter");
                System.out.println("Added butter while reading");
            }
        }

        System.out.println("Final list is: " + groceryList);

        // esme bhi example dekh liyo Thread vala
    }
}
