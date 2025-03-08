package _1_engineeringDigestCoreJava._1_com._4_Exceptions;

public class arrayDiv {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 2, 0, 4};
        for (int i = 0; i < a.length; i++){
                System.out.println(divide(a[i], b[i]));
        }
    }
    static int divide (int a, int b) {
        try {
            return a / b;
        }
        catch (Exception e) { // acc. to this error /0  we can write Exception/ RuntimeException/ ArithmeticException/ Throwable
            System.out.println(e);
            return -1;
        }

    }
}
