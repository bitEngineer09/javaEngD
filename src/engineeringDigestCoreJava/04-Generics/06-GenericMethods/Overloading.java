package engineeringDigestCoreJava.Generics.GenericMethods;

public class Overloading {
    public static void main(String[] args) {
        show(23.45);
        show(23);
    }
    static <T> void show(T element) {
        System.out.println("Generic Display " + element);
    }

    static void show(Integer element) {
        // jab tumne khud se wrapper class de diya to <> likhne ki jarurat nahi hai.
        System.out.println("Integer Display " + element);
    }
}
