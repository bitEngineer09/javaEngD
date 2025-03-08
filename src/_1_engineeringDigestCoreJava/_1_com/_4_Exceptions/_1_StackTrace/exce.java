package _1_engineeringDigestCoreJava._1_com._4_Exceptions._1_StackTrace;

public class exce {
    public static void main(String[] args) {
        try { // w/o try catch bhi same cheez aaegi
            lvl3();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    static void lvl1(){
            int[] a = new int[5];
            a[5] = 10;
            System.out.println(a[5]);
    }

    static void lvl2(){
        lvl1();
    }

    static void lvl3(){
        lvl2();
    }
}
