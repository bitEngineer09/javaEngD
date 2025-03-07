package Java8_Basics;

import java.util.function.BinaryOperator;

// BinaryOperator<T> extends BiFunction<T,T,T>
// eska matlab dono args same type ke honge and same return type hee hoga.

public class _7_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> binary = (x, y) -> x + y;
    }
}
