package KkDsaBootCamp.SwitchCases;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String deptName = sc.next();
//        switch (empId) {
//            case 1 :
//                System.out.println("Gautam");
//
//                switch (deptName) {
//                    case "IT" :
//                        System.out.println("Information Technology Department");
//                        break;
//                    case "HR" :
//                        System.out.println("Human Resource Department");
//                        break;
//                }
//                break;
//
//            case 2 :
//                System.out.println("Sujit");
//
//                switch (deptName) {
//                    case "IT" :
//                        System.out.println("Information Technology Department");
//                        break;
//                    case "HR" :
//                        System.out.println("Human Resource Department");
//                        break;
//                }
//                break;
//
//            case 3 :
//                System.out.println("Anish");
//
//                switch (deptName) {
//                    case "IT" :
//                        System.out.println("Information Technology Department");
//                        break;
//                    case "HR" :
//                        System.out.println("Human Resource Department");
//                        break;
//                }
//                break;
//
//            default:
//                System.out.println("Enter valid employee..");
//        }


//------------------ Simplified---------------------------

        switch (empId) {
            case 1 -> {
                System.out.println("Gautam");
                switch (deptName) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("CSE department");
                }
            }
            case 2 -> {
                System.out.println("Sujit");
                switch (deptName) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("CSE department");
                }
            }
        }

    }
}
