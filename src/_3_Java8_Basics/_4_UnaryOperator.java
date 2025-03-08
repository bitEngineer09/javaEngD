package _3_Java8_Basics;

// UnaryOperator<T>
// extends Function<T, U>

import java.util.function.UnaryOperator;

public class _4_UnaryOperator {
    public static void main(String[] args) {
        // * Function me hume single args me bhi do Type likhne pad re the

           // Function<Integer, Integer> square = x -> x * x;
        // That's why Java introduced Unary operator

        UnaryOperator<Integer> unary = x -> x * x;
    }
}
