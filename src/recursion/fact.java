package recursion;
// when a method calls itself again and again, it is called recursion

public class fact {

        public static void main(String[] args) {
            System.out.println(factorial(4));
        }
/*   by using loops
    public static int factorial(int x)
        {
            int res = 1;
            for (int i = x; i > 0; i--)
            {
                res = res * i;
            }
            return res;
        }
*/
        public static int factorial (int x)
        {
            if (x == 1)  // base case
            {
                return 1;
            }
            return x * factorial(x - 1);
//            factorial method khud ko hee bula raha hai inside its method.
//            also we need a BASE CASE to stop the recursion
        }
}


