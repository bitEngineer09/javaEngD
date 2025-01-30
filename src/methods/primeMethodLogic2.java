package methods;
// Note --> Koi bhi number uske half se jyada divide hoga hee nahi
public class primeMethodLogic2 {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
    public static boolean isPrime (int x)
    {
        int res = 0;
        for (int i = 1; i <= x / 2; i++)
        {
            if (x % i == 0)
            {
                res++;
            }
        }
        if (res == 1) // agar divisor 1 se jyada hue to vo prime nahi hua, we have not included number itself therefore the divisor left will be only 1.
        {
            return true;
        }
        else
        {
            return false;
        }
//        OR
//        return res == 1; //write this instead of if else block

    }
}
