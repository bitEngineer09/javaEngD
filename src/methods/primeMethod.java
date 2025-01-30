package methods;
// first logic of Is prime ??

public class primeMethod {
    public static void main(String[] args) {
        isPrime(5);
        isPrime(12);
    }

    public static int isPrime(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Enter valid input !");
        }
        for (int i = 2; i < num ; i++) {
            if (num % i == 0){
                System.out.println("Not Prime.");
                break;
            }
            else {
                System.out.println("Prime");
                break;
            }
        }
        return num;
    }
}
