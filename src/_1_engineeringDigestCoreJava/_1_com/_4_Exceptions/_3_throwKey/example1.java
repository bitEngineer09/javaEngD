package _1_engineeringDigestCoreJava._1_com._4_Exceptions._3_throwKey;
// throw keyword is used to explicitly throw an exception from a method or any block of code.
// forcefully exception throw karane ke liye use hota hai

import java.io.FileNotFoundException;
import java.io.FileReader;

public class example1 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader fl = new FileReader("a.txt");
        }
        catch (Exception e){
            System.out.println("Exception Found");
            throw new FileNotFoundException("oops");
        }
    }
}
