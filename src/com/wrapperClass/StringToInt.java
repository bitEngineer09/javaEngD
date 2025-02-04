package com.wrapperClass;

public class StringToInt {
    public static void main(String[] args) {
        String str = "1234";
        int c = Integer.valueOf(str);
        Integer d = Integer.valueOf(str); // also

        System.out.println(c);
        System.out.println(d );
    }
}
