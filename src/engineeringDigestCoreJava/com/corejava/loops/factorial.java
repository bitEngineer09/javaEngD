package engineeringDigestCoreJava.com.engineeringdigest.corejava.loops;

public class factorial {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        while (num > 0){
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);
    }
}
