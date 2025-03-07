package Java8_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
// Consumer <T>
// also a functional interface
// has method called accept(), ye bass lega, dega nahi, usko use kar lega

public class _5_Consumer {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printArray = x -> {
            for (int i: x) {
                System.out.print(i + " ");
            }
        };

        printArray.accept(list); // ye humne ek tarah se oneLiner method bana diya hai

//------------BiConsumer-------------------
//        Biconsumer<T, U>

        BiConsumer<Integer, Integer> biconsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
    }
}
