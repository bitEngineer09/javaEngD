package Java8_Basics;
// Predicate<T>

// Predicate ->  is a functional interface (Boolean valued function)
// agar hume kuch check karna hai to Predicate use karna chahiye
// It just holds the condition.

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _2_Predicate {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0; // ye hum ek condition ko variable me store kar re hai, It is functional programming.
        isEven.test(5);
        isEven.test(8);

        Predicate<String> startsWith = x -> x.startsWith("A");
        boolean apple = startsWith.test("Apple");
        System.out.println(apple);

        Predicate<String> endsWith = x -> x.endsWith("e");

        Predicate<String> combine = startsWith.and(endsWith);
        combine.test("Apple");
        combine.test("App");
        combine.test("Ease");


//-----------BiPredicate----------------------------
        BiPredicate<Integer, Integer> even = (x, y) -> (x + y) % 2 == 0;
        even.test(23, 47);

    }
}
