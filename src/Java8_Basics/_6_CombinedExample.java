package Java8_Basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _6_CombinedExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consume = x -> System.out.println(x);
        Supplier<Integer> supply = () -> 100;

        if (isEven.test(supply.get())) {
            consume.accept(function.apply(supply.get()));
        }
    }
}
