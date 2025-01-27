import java.util.Scanner;
public class CalC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input form user till user does not press X or x

        int answer = 0;
        while(true){ // true se infinty times loop chalega.
            System.out.print("Enter operand: ");
            char operand = scanner.next().trim().charAt(0);

            if(operand == '+' || operand == '-' || operand == '*' || operand == '/' || operand == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                if (operand == '+') {
                    answer = num1 + num2;
                }
                if (operand == '-') {
                    answer = num1 - num1;
                }
                if (operand == '*') {
                    answer = num1 * num2;
                }
                if (operand == '/') {
                    if(num1 != 0){
                        answer = num1 / num2;
                    }
                }
                if (operand == '%') {
                    if(num1 != 0){
                        answer = num1 % num2;
                    }
                }
            }
                // es else ko main parent (if) se bahar rakhna hai kyuki tabhi vo operands vali condition ke bahar aaega.
                else if(operand == 'X' || operand == 'x'){
                    break;
                }
                else{
                    System.out.println("Wrong Input / Invalid Operation");
                }
                System.out.println(answer); // answer, (if) condition ke ander rehkar hee print hoga.
            }
        }
    }
