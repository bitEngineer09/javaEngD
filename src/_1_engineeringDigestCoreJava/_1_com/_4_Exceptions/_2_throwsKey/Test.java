package _1_engineeringDigestCoreJava._1_com._4_Exceptions._2_throwsKey;
// throws keyword is used in method signatures to declare that a method might throw one or more exceptions.

import java.io.FileReader;

public class Test {
    public static void main(String[] args) { //throws FileNotFoundException, agar yaha throws use kiya to ab JVM responsible hoga use handle karne ke liye

    }

    static void lvl2() throws Exception{ // lvl2 method is now responsible for handling exception
        lvl1();
    }

    static void lvl1() throws Exception { // ab es exception ko handle karne ki responsibility uspe hogi jo ese call karega
        FileReader flreader = new FileReader("a.txt");
    }
}