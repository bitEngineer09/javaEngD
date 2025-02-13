package KkDsaBootCamp.Methods;

public class isArmstrong {
    public static void main(String[] args) {
        boolean num1 = armstrong(153);
        System.out.println(num1);
    }
    static boolean armstrong(int x) {
        int original = x;
        int sum = 0;
        while (x > 0) {
            int rem = x % 10;
            sum += rem * rem * rem;
            x = x / 10;
        }
        return sum == original;
    }
}
