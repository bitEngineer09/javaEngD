import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while(number > 0){
            int remainder = number % 10; // % gives remainder
            number = number / 10;  // ye remainder vala part hata dega yaani ki es step ke baad given number me se last digit hat jaaega.
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
// 1) suppose input is 7398.
// 2) initially reverse var me 0 store hai, then number ko 10 se %(modulo) karke remainder me 8 store ho jaaega.
// 3) ab pure number me se es last digit i.e., 8 ko remove karne ke liye /(divide) operator karo kyuki ye quotient deta hai and then ye hoga.
// in each while loop step -->                      0   *   10  +  8   (8)
// Second iteration -->                             8   *   10  +  9   (89)
// Third iteration  -->                             89  *   10  +  3   (893)
// Fourth iteration -->                             893 *   10  +  7   (8937)