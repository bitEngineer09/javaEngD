package _1_engineeringDigestCoreJava._1_com._4_Exceptions._4_Finally;


public class Test {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }
    static int divide(int a, int b){
        try {
            return a / b;
        }
        catch (Exception e){
//            System.out.println(e);
            return 0;
        }
        finally{
            System.out.println("This block will execute in any condition");
        }

    }
}
