package com.Exceptions.multiCatch;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 2, 0, 4};
        for (int i = 0; i < a.length; i++){
            System.out.println(divide(a[i], b[i]));
        }
        System.out.println("Good Job");
    }
    static int divide (int a, int b) {
        try {
            Student student = null;
            student.setId(123);
            return a / b;
        }
        catch (ArithmeticException e){ // ye excep. nahi hua to agla chalega, fir vo bhi nahi hua to agla chalega,
            System.out.println("Arithmetic Exception ):");
            return -1;
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Ecxeption ):");
            return -1;
        }
        catch (Exception e) { // ye parent class hai sabhi exceptions ki therfor pehle mat daalo, always use it according to hierarchy.
            System.out.println(e);
            return -1;
        }
    }
}
