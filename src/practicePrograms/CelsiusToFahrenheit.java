import java.util.Scanner;
public class CelsiusToFahrenheit{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float TempC = input.nextFloat();
        float TempF = (TempC*9/5)+32;
        System.out.println(TempF+" Fahrenheit");

        // pure temp ko 9 se multiply karke 5 se divide kar do and then whole result me 32 add kar do
    }
}
