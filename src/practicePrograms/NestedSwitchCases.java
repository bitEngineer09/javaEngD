import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int EmpId = scanner.nextInt();

        switch (EmpId) {
            case 1:
                System.out.println("Gautam Yadav");
                System.out.println("Salary: Rs. 80000");
                System.out.println("Dept: HR");
                break;
            case 2:
                System.out.println("Alok Kumar");
                System.out.println("Salary: Rs. 90000");
                System.out.println("Dept: IT");
                break;
            case 3:
                String department = scanner.next();
                System.out.println("Dept name"); // 1-> ye statement tabhi execute hoga jab hum 3
                                                             // enter karenege and uske baad department ka koi case daalenge tab execute hoga.
                switch (department) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "HR":
                        System.out.println("HR dept");
                        break;
                    default:
                        System.out.println("No department found");
                }
                break; // ye vala break humne case 3 ka dala hai.
            default:
                System.out.println("Enter correct Employee ID");
        }

// ...................................................................................
// Enhanced Switch Statement.

        switch (EmpId) {
            case 1 -> System.out.println("Gautam Yadav");
            case 2 -> System.out.println("Alok Kumar");
            case 3 -> {
                String department = scanner.next();
                System.out.println("Dept name");
                switch (department) {
                    case "IT" -> System.out.println("IT dept");
                    case "HR" -> System.out.println("HR dept");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("Enter correct Employee ID.");
            }
        }
}

