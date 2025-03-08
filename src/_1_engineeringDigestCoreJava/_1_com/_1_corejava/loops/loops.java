package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.loops;

public class loops {
    public static void main(String[] args) {
//        We have three types of loops in java..

//      for loop
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }
        System.out.println("Ends");

//      Entry controlled loop
        int j = 0;
        while (j < 5){
            System.out.println("While Loop");
            j++;
        }
        System.out.println("Ends");

//      Exit Controlled loop
        int k = 11;
        do{
            System.out.println(k+" : "+7+9);
            k++;
        }while(k < 10);
        System.out.println("Ends");

    }
}
