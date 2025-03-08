package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.basics;

public class bitwise {
    public static void main(String[] args) {
        /*
           1)  and (&)  --> T T = T  else F
           2)  or (|)     --> F F = F else T
           3)  xor ^     --> T T = T , F F = T , else F   {UNARY OPERATOR}
           4)  not (~)
           5)  left shift (<<)
           6)  right shift (>>)
           7)  unsigned right shift (>>>)
        */

        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int b = a >> 1;
        System.out.println(Integer.toBinaryString(b));

}
}
