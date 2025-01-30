package methods;
// Method overloading example
/*
    1) In method OVERLOADING we can have multiple functions but having "different parameters"..
    2) sum(int a, int b) --> Method signature
    3) We can have same method signature with different parameters known as method overloading, and can have different return types;
    For eg:
    * void sum(int a, int b);
    * int sum(int a, int b, int c);
    * float sum(int a, flaot b);
    * double sum(int a, double b);
*/
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
