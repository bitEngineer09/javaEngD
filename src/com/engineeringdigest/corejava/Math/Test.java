package com.engineeringdigest.corejava.Math;

public class Test {
    public static void main(String[] args) {
        int a = 5; int b = 11;
        Math.max(a, b);
        Math.min(a, b);
        int c = -1;
        System.out.println(Math.abs(c));

        System.out.println(1 + Math.PI);
        System.out.println(Math.random()); // values between( 0.0 --> 1.0) excluding 1.0
        System.out.println((int)(Math.random() * 11));

        double d = 78.384;
        double ceil = Math.ceil(d); // just uper vala integer
        System.out.println(ceil);

        double floor = Math.floor(d); // just neeche vala integer
        System.out.println(floor);

        Math.sqrt(a);
        Math.round(d);
        Math.pow(2,3);
        Math.log(d);
        Math.log10(d); // log base 10

    }
}
