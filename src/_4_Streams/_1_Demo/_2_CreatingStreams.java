package _4_Streams._1_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _2_CreatingStreams {
    public static void main(String[] args) {
//    1. From Collections
        List<String> list = new ArrayList<>();
        Stream<String> one = list.stream();

//    2. From Arrays
        String[] arr = {"Ram, Shyam", "GhanShyam"};
        Stream<String> two = Arrays.stream(arr);

//    3. Using Stream.of()
        Stream<String> three = Stream.of("apple", "mango");

//    4. Infinite Streams
        // a) generate
        // b) iterate
        Stream<Integer> four = Stream.generate(() -> 1).limit(100); // .generate(supplier)
        // ek infinte stream hai jisme sirf 1 hai
        // uski size bhi limit kar sakte hai by .limit

        // Another way
        Stream<Integer> five = Stream.iterate(0, x -> x + 1); // seed{starting pt} and unaryOperator leta hai
        System.out.println(five.limit(100).collect(Collectors.toList()));
    }
}
