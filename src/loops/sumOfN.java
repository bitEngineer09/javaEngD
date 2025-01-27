package loops;
import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Using FOR loop
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num + 1; i++){
            sum = sum + i;
//            i = 1 --> 0 + 1 = 1
//            i = 2 --> 1 + 2 = 3
//            i = 3 --> 3 + 3 = 6
//            i = 4 --> 6 + 4 = 10.....& so on....
        }
        System.out.println(sum);

//        Using WHILE loop
        System.out.println("Enter second number: ");
        int number = sc.nextInt();
        int j = 1;
        int ans = 0;
        while (j <= number){
            ans = ans + j;
            j++;
        }
        System.out.println(ans);
    }
}
