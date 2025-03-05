package CollectionFramework._4_MapInterface._1HashMapsOne;
// ********* ye eg pura nahi hai dekh liyo
import java.util.HashMap;

public class Eg {
    public static void main(String[] args) {

//  object ke case me HashCode memory address se banta hai,
//  matlab ki jitne bhi hum object banaenge kisi class ke, to sabka different Hashcode banega
//  equals check karega ki reference same hai hai yaa nahi

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        HashMap<Person, String> map = new HashMap<>();
        map.put(p1, "Engineer");  // hashcode1 --> index1
        map.put(p2, "Teacher");   // hashcode2 --> index2
        map.put(p3, "Manager");   // hashcode3 --> index3

        // yaha p1 and p3 to same person hee hai, to yaha unki designation replace nahi hogi
        // balki alag hascode generate ke vajah se naye index pe value store hogi


//        this is normal case ---->
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("Shubham", 90);   // hashcode1 --> index1
//        map1.put("Aman", 98);      // hashcode2 --> index2
//        map1.put("Shubham", 99);   // hashcode1 --> index1 --> equals() --> replace
    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
