package _1_engineeringDigestCoreJava._1_com._4_Exceptions._3_throwKey;

import java.io.FileNotFoundException;
// Note--> agar hum unchecked excep. throw karte hai tab to throws ki jarurat nahi hai,
// but in case of Checked Exceptions throws bhi use karna hoga.
// yaha check kar liyo by using ArithmeticException
public class example2 {
    public static void main(String[] args) throws Exception {
    method1();
    }
    static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("Maine exception bina matlab ke forcefully dala hai");
    }
}
