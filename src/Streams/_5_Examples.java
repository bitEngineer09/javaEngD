package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class _5_Examples {
    public static void main(String[] args) {
        // EXAMPLE 1 -> Filtering and Collecting Names
        List<String> names = Arrays.asList("Ram", "Mohan", "Sohan", "DharamVeer");
        List<String> list = names.stream().filter(x -> x.length() > 3).sorted().toList();
        System.out.println(list);


        // EXAMPLE 2 -> Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5,3,7,4,2,8,9);
        final List<Integer> list1 = numbers.stream().map(x -> x * x).sorted().toList();
        System.out.println(list1);


        // EXAMPLE 3 -> Summing values
        List<Integer> sum = Arrays.asList(21,34,21,67);
        final Optional<Integer> reduce = sum.stream().reduce((x, y) -> x + y);
        Optional<Integer> reduce1 = sum.stream().reduce(Integer::sum); // Method Ref
        System.out.println(reduce.get());  // 143
        System.out.println(reduce);  // Optional[143]


        // EXAMPLE 4 -> Counting occurrences of character
        String sentence = "Hello World";
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);

        // EXAMPLE 5 ->
        // * Streams cannot be reused after a terminal operation has been called.
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception

    }
}
