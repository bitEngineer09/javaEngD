package loops;

import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = 0;
        while (number > 0) {
            number = number / 10; // divide by 10 gives last digit.
            digits++; //  increase digits by 1.
        }
        System.out.println(digits);

    }
}
