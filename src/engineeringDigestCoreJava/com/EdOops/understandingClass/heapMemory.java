package engineeringDigestCoreJava.com.student.understandingClass;

public class heapMemory {
    public static void main(String[] args) {
        String  a = new String("RAM");
        String b = new String("RAM");
        System.out.println(a == b); // false
        /*
        coz a & b stores refernce of object, and jab bhi hum naya object banate hai memory me naya refrence
        create hota hai. Therfore a & b reference are differnet.
        */

        String c = "RAM";
        String d = "RAM";
        System.out.println(c == d); // true
        /*
        coz jab ek baar 'c' varibale me "RAM" dala the vo {string pool}  me chala gaya, and ab jab bhi same string aaega to java check
        karega ki vo string pool me kaha aya hai and then usi ak reference store kar lega.
       */

//        NOTE --> String pool is in Heap Memory.
    }
}
