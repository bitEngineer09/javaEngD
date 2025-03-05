package KkDsaBootCamp.ConditonalsAndLoops;

import java.util.Scanner;

// find nth fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Nth fibonacci is: " + b);
    }
}
