//    Q: Find occurrences of a digit in a given number.

import java.util.Scanner;
public class OccOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 133389;
        int count = 0;
        while(num > 0){
            int rem = num % 10;  // jab bhi kisi number ko 10 se divide karte hai to remainder me last digit milta hai.
            if(rem == 3){
                count++;
            }
            num /= 10;           // num = num / 10
        }
        System.out.println(count);
    }
}
