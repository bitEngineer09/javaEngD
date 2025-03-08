package _1_engineeringDigestCoreJava._1_com._1_corejava._1_basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

    }

    static void demo(int ...v) {
// internally ye array jaisa hee hai

        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
// aise mix arguments me VarLength arguments ko last me likhna chahiye.
// suppose hum beech me var agrs dal de fir uske baad koi single var, to bhyii
// hume pata kaise chalega ki var args ab khatam ho gaya

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}