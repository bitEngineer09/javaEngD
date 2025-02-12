package engineeringDigestCoreJava.com.engineeringdigest.corejava.methods;
// Method overloading example

public class methodOverload {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 5));
        System.out.println(sum(2, 3, 6, 8));
    }
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    public static int sum (int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
