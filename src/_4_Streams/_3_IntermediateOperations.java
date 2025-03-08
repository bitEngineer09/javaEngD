package _4_Streams;

// Intermediate operations transform a stream into another stream
// They are lazy, meaning they don't execute until a terminal operation is invoked.
// Some intermediate operations are as follows

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _3_IntermediateOperations {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "Mohan", "Sohan", "Mohan");

//  1. filter , predicate leta hai
        Stream<String> filterdStream = list.stream().filter(x -> x.startsWith("R"));
        // ab esme jab tak terminal operations apply nahi karenge tab tak ye nahi chalega.
        // So no filtering at this point.

        long Filtered = filterdStream.count(); // ab filter hua hai, This is a terminal operation.
//        System.out.println(Filtered);

//  2. map, function leta hai
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        // also can be replaced by method reference
        Stream<String> stringStream1 = list.stream().map(String::toUpperCase);

//  3. sorted
        // sorts in natural order
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((x, y) ->  y.length() - x.length());

//  4. distinct  -> removes duplicate values
        Stream<String> newStream = list.stream().filter(x -> x.startsWith("M")).distinct(); // but ye nahi chalega jab tak terminal operation nahi chalta
        final long count = newStream.count();
        System.out.println(count);  // o/p -> 1

//  5. limit
        Stream<Integer> infinte = Stream.generate(() -> 2).limit(10);

//  6. skip
        Stream<Integer> a = Stream.iterate(1 ,x -> x + 1).skip(10).limit(100); // pehle ke 10 skip ho jaaenge
        // fir output 11 se 110 tak aaega coz limit 100 elements ki lagi hai

//  7. peek , consumer leta hai
        // Performs an action on each element it consumed.
        Stream.iterate(0, x -> x + 1).limit(100).peek(System.out::println).count();

        // forEach use karenge end karne ke liye
        // peek use karenge beech me kuch daalne ke liye

//  8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., Lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Bear", "Fox"),
                Arrays.asList("Mango", "PolarBear", "Wolf"),
                Arrays.asList("Pear", "GrizzlyBear", "Husky")
        );
        System.out.println(listOfLists.get(1).get(1));


//-------------------------------------------------------------------------------------
        // EXAMPLE 1 -> sabhi elements ek hee sequence me chahiye, and Uppercase bhi karna hai
        List<String> allName = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();  // flatMap(x -> x.stream()) -> list ko stream me convert kar ra hai
        // flatMap flat bhi kar ra hai, and map bhi kar ra hai
        System.out.println(allName);

        // EXAMPLE 2 -> ek list hai sentences ki, jisme each sentence ke word ki stream banani hai.
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Streams are powerfull",
                "Namaste India"
        );

        // EXAMPLE 3
        List<String> words = sentences
                .stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase).toList();  // .split array return karta hai
        // but hume stream chahiye so, Arrays.stream() use karo.
        System.out.println(words);

    }
}
