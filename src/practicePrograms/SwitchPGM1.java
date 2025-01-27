import java.util.Scanner;

public class SwitchPGM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

//        ............................................................................................................................................
//        This is another way to write the switch statement. It checks if the day is in the range of 1 to 5 (inclusive) or 6 or 7.
//        Enhanced switch statement

//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//        }
    }
}