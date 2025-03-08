package _1_engineeringDigestCoreJava._4_Generics.GenericMethods;

public class Test {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4 };
        String[] b = {"Hello", "World", "Threads"};
        printArray(a); // hume wrapper classes pass karni padengi.
        printArray(b);

//        add(2, 3);
    }

    static <T> void printArray(T[] a) {
        for (T i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

//    static <P,Q> void add(P a, Q b) { // ese sahi kar
//        int sum = a + b;
//        System.out.println(sum);
//    }
}
