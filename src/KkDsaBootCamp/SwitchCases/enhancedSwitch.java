package KkDsaBootCamp.SwitchCases;

import java.util.Scanner;
// break is not required
public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> { // also valid
                System.out.println("Monday");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Weekend");
            case 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day!");
        }

//            if (day == 1) {
//                System.out.println("Monday");
//            } else if (day == 2) {
//                System.out.println("Tuesday");
//            } else if (day == 3) {
//                System.out.println("Wednesday");
//            } else if (day == 4) {
//                System.out.println("Thursday");
//            } else if (day == 5) {
//                System.out.println("Friday");
//            } else if (day == 6) {
//                System.out.println("Weekend");
//            } else if (day == 7) {
//                System.out.println("Weekend");
//            } else {
//                System.out.println("Invalid Day!");
//            }
    }
}
