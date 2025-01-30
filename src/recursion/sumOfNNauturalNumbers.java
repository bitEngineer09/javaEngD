package recursion;

public class sumOfNNauturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum (int x)
    {
        if (x == 0) // BASE CASE  or (x == 1) bhi sahi hai
        {
            return 0;
        }
        return x + sum(x - 1);
    }
}
