package engineeringDigestCoreJava.com.engineeringdigest.corejava.basics;

public class vars {
    public static void main(String[] args) {
        /*
          1)  Case sensitive -> (Apple) is diff from (apple).
          2)  contains alphabets, digits, underscores, dollar.
          3)  can't start with (digits).
          4)  can be any java keywords.
        */

        // * In java we use {camelCase} characters.

        String  apple = "red";
        String APPLE = "RED";

        int num12 = 34; // ye value memory me STACK me store ho ri hai
        System.out.println(APPLE);
        System.out.println(apple);
        System.out.println(num12);

        int sum$_34 = 45; // Valid
        System.out.println(sum$_34);
    }
}
