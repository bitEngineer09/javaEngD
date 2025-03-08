package _1_engineeringDigestCoreJava._1_com._5_wrapperClass;
// Wrapper classes convert the primitve values into objects.
// We can do any operation on these wrapper classes like primitive data.
// These are classes therefore it can hold Null, but primitive can't.
// These contain various methods.

public class Test {
    public static void main(String[] args) {
        int a = 3;     // a ek primitive var hai. Data will be stored in STACK.

        Integer b = 4; // here 'b' is ref var of Integer class and is an object, coz Integer is a class. Data will be stored in heap.
                       // ab b se related various methods use kar sakte hai.


        Integer e = Integer.valueOf(34); // behind the scene(AutoBoxing)
//      int x = e; This can be done directly
        int x = e.intValue();  // UnBoxing (Unnecessary Unboxing)

        Integer.max(1, 4);
        Integer.toBinaryString(100);
        Integer.bitCount(23);


        Boolean logic = true;
        Float f = 12.45f;
        Double d = 45.34356;
        Byte bb = 12;
        Short s = 34;
        Long l = 13l;
    }
}
