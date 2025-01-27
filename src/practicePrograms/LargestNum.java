// Q: PRINT LARGEST OF THREE NUMBERS

//import java.util.Scanner;
//public class LargestNum {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
////        ...............................................................................................................
////       METHOD 1
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.print(max);
//
////        ...............................................................................................................
////        METHOD 2
//        int max = 0;
//        if (a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);
////        ...............................................................................................................
////        METHOD 3
//        int max = Math.max(c, Math.max(a, b));
//        System.out.println(max);
//    }
//}