//   Q: program to find fibonacci series till given term(n).

import java.util.Scanner;
public class FibonacciPt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int n = sc.nextInt(); // * jis term tak hume fibonacci series chahiye vo enter karo
        int x = 0;
        int y = 1;
        int z = 0;
        for(int i = 0; i <= n; i++){
            System.out.print(z+" ");
            x = y;
            y = z;
            z = x + y;
        }
        // System.out.print(z+" "); ese loop ke bahar print karne se given term vala fibonacci number milega.

    }

}
