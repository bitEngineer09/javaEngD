package com.engineeringdigest.corejava.loops;

public class pgm_1 {
    /*
    * 1
    * 10
    * 100
    * 1000
    * 10000
    * 100000
    * */
    public static void main(String[] args) {
        for (int i = 1, j = 1; j < 7; i = i * 10, j++){
//            j for columns, j har iteration par ek badhega.
//            i humne fix kiya i.e., '1'.
            System.out.println(i);
        }
    }
}
