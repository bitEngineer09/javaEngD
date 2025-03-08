package _4_Streams._2_ParalleStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        // EXAMPLE 1 -> Collecting names by length
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alexander", "David", "Veer Mahaan");

        final Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));

//        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

        // EXAMPLE 2 -> Counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // EXAMPLE 3 -> Partitioning Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum)); // ye optional dega
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
        // .toMap(key ke kya mapping rakhni hai, value ke liye kya mapping rakhni hai)

        // Example 6: occurring of each word
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream()
                .collect(Collectors
                        .toMap(k -> k, v -> 1, (x, y) -> x + y)));
        // v -> 1, ka matlab hai ki jab apple pe pehli baar aaega to abhi vo ek hai
        // eske baad merge function daalo, ye binary Function hai.
        // dubara fir jab apple pe aaega to merge Function chalega.
        // purane vale apple ka count 1, second apple ka count 1
        // Then dono ko add kar dega, similarly aise hee chalte rahega for each and every elements.

        // jab bhi .toMap() use karenge and agar duplicate hai, to merge function batana padega.

    }
}
