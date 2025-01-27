import java.util.Scanner;
public class Cases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruits = scanner.next();
        switch (fruits){
            case "Apple":
                System.out.print("An apple keeps a good balance.");
                break;  // agar hum break use nahi karenge to aage vale sare cases print honge jab tak agla break nahi milega.
            case "Banana":
                System.out.println("Sold in dozens.");
                break;
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Grapes":
                System.out.println("Grapes are sour.");
                break;
            default:  // default me naa koi (break) or naahi koi (varibale) daalte hai.
                System.out.println("Random fruit.");
        }

//  ................................................................................................................................................................................
//        Enhanced Switch Statement
//        switch (fruits) {
//            case "Apple" -> System.out.println("An apple keeps a good balance.");
//            case "Banana" -> System.out.println("A banana is a good source of vitamin C.");
//            case "Mango" -> System.out.println("A mango is a good source of vitamin B6.");
//            case "Grapes" -> System.out.println("Grapes are sour.");
//            default -> System.out.println("Invalid fruit.");
//        }
    }
}
// My name is Gautam Yadav. I'm from India. I'm a software engineer. I have recently joined this company. I'm passionate about technology and programming. I'm
