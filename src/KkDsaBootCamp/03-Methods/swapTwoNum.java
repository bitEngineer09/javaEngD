package KkDsaBootCamp.Methods;

public class swapTwoNum {
    public static void main(String[] args) {
        int a = 24;
        int b = 45;

        System.out.println("Before swapping: " + a + " " + b);

        swap(a, b);
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: " + a + " " + b);
    }
}
