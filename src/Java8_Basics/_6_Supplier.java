package Java8_Basics;

// Supplier only returns
// Supplier <T>
// BiSupplier nahi hota hai
import java.util.function.Supplier;

public class _6_Supplier {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "HelloWorld";

        final String s = giveHelloWorld.get();
        System.out.println(s);
    }
}
