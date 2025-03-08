package _4_Streams._3_Collectors;
// jaise hamari arrays, Collections utility classes hai, usi tarah Collectors bhi utility class hai

import java.util.*;
import java.util.stream.Collectors;

// Collectors is a utility class
// provides a set of methods to create common collectors
public class CollectorsDemo {
    public static void main(String[] args) {

        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);


        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);


        // 3. Collecting to a Specific Collection
                // .toCollection , supplier leta hai
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        LinkedList<String> collectList = names.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));


        // 4. Joining Strings
                // Concatenates stream elements into a single String
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);


        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max)

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());


        // 6. Calculating Averages
        Double collect1 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Avg: " + collect1);


        // 7. Counting Elements
        Long total = numbers.stream().collect(Collectors.counting()); // Long return karega
        System.out.println("Count: " + total);


        // 8. Grouping Elements
        List<String> words = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length()))); // eska matlab ki length ke basis par grouping kar do

        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")))); // eska matlab ki group karne ke baad, ab each group me kya karna hai, humne yaha comma and space add kiya hai

        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()))); // har ek group ke elements count karega

        TreeMap<Integer, Long> tree = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting())); // esme koi collections de sakte hai
        System.out.println(tree);  // esme data Tree me store hoga


        // 9. Partitioning Elements
        //  Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // output -> {false=[Anna, Bob, Brian, Alice], true=[Alexander]}


        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
        // collect karne se pehle kuch kaam karana hai to kar sakte hai
        // ek tarah se shortcut hai ki alag se map nahi karna padega

        // o/p -> [ANNA, BOB, ALEXANDER, BRIAN, ALICE]







    }
}
