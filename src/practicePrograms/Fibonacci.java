//    Q: Fibonacci series till a given max value.
//       (user se ek max value input leni hai, jaha tak jo bhi last fibonacci number
//       hoga vaha tak series print karna hai.

//     reference : https://www.youtube.com/watch?v=kDd6_-6HEsA

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      ye teen variables fix rahenge.
        int x = 0;
        int y = 1;
        int sum = 0;
        System.out.print("Give max value: ");
        int maxValue = input.nextInt();
        while(sum <= maxValue){
            System.out.print(sum+" ");
            x = y;                       // x me y ki value daalo.
            y = sum;                     // y me sum ki value daalo.
            sum = x + y;                 // sum me add kar do
                                         // 1) fir loop yehi repeat karega till max value
                                         // jaha tak ka fibonacci number mile.
        }
    }
}
