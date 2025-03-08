package _3_Java8_Basics;

// Function<T, R>

// Function, predicate ki tarah ek functional interface hai
// Predicate sirf condition check karta hai, jabki
// Function kaam karega (work for you)

import java.util.function.BiFunction;
import java.util.function.Function;

public class _3_Function {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = x -> x * 2;
        final Integer apply = doubleIt.apply(34);
        System.out.println(apply);

        Function<Integer, Integer> tripleIt = x -> x * x * x;
        final Integer apply1 = tripleIt.apply(2);
        System.out.println(apply1);

        Function<Integer, Integer> check = doubleIt.andThen(tripleIt);
        System.out.println(check.apply(2));

//      doubleIt.compose(tripleIt); // pehle second apply hoga then first

        Function<Integer, Integer> identity = Function.identity();// static method hai, jo doge vahi return karega
        final Integer apply2 = identity.apply(5);
        System.out.println(apply2);

//-----------------BiFunction------------------------
//        BiFunction<T, U, R>
        // T and U are input args
        // R is return type arg

        BiFunction<String, String, Integer> test = (x, y) -> x.length() + y.length();
        final Integer apply3 = test.apply("Apple", "Mango");
        System.out.println(apply3);

    }
}
