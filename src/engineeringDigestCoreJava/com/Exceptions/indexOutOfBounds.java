package engineeringDigestCoreJava.com.Exceptions;

import java.lang.reflect.Executable;

public class indexOutOfBounds {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};
        int[] b = {1,0,10,5};

            for (int i = 0; i < 10; i++){
                try{
                System.out.println(divide(a[i], b[i]));
                }
                catch (Exception e){
                    System.out.println(e);
                }
        }
        System.out.println("GOOD JOB :)");

    }
    static int divide(int a, int b){
        try{
            return a / b;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        return -1;
    }
}
