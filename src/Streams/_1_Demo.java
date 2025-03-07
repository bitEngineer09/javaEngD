package Streams;

// feature introduced in Java 8
// process collections of data in a functional and declarative manner
// Simplify Data Processing
// Embrace Functional Programming
// Improve Readability and Maintainability
// Enable Easy Parallelism

// * What is Stream ?
//    a sequence of elements supporting functional and declarative programming.

// * How to Use Streams ?
//    Source, intermediate operations & terminal operation

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1_Demo {
    public static void main(String[] args) {

//  NOTE -> Agar kisi bhi collections par declarative and functional programming karni hai, to use streams me covert karenge.

        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        final Stream<Integer> stream = list.stream(); // converted to Stream

        // Traditional way ->
//        int count = 0;
//        for (Integer i: list) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // Streams Way ->
        final long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);

        // 1) source : list
        // 2) intermediate operations : .stream().filter()
        // 3) terminal operation (akhir me hume jo chahiye) : .count()
    }
}
