import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        .next se vo next word input lega
//        .trim se saari unwanted spaces clear karega
//        .charAt se word ke character ke index ko specify karega

        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}