package _4_Streams._1_Demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _4_TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

//  1. collect , collector leta hai
        final List<Integer> collect = list.stream().collect(Collectors.toList());   // Returns a Collector that accumulates the input elements into a new List.
                                                                                    // There are no guarantees on the type, mutability, serializability,or thread-safety of the List returned;
        // EXPLORE
        final Set<Integer> collect1 = list.stream().collect(Collectors.toSet());
        final List<Integer> collect2 = list.stream().collect(Collectors.toUnmodifiableList());

        // Note -> Directly .toList bhi likh sakte hai, but depends on which java version you are working on.
        final List<Integer> list1 = list.stream().toList();

//  2. forEach , consumer {bass lega, kuch dega nhi} leta hai
        list.stream().forEach(x -> System.out.println(x));

//  3. reduce : Combines element to produce single result
        // binaryFunction leta hai
        final Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);// ye ab elements ka combine result dega
        System.out.println(reduce.get());

        Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);

//  4. count

//  ShortCircuitMethods -> As soon as they finds a match or something, they stop processing rest of elements

//  5. anyMatch, allMatch, noneMatch  (Short circuit methods / operations)
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0); // jaise hee koi non match element mila ye process band kar dega (Short Circuit)
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);


//  6. findFirst, findAny  (Short circuit methods / operations)
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());  // kuch bhi laake de dega
        // findany koi bhi bhi element uthaega and then stop kar dega operation, that's why it is called ShortCircuit Operation


//  7. toArray
        // kisi bhi stream ko array me convert karega
        // end bhi karega

        Object[] array = Stream.of(1,2,3).toArray();


//  8. min / max
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o2 - o1));  // yaha ordering lambda exp se kiya hai
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));


//  9. forEachOrdered

        // Using forEach in parallel stream
        List<Integer> digits = Arrays.asList(1, 2, 3, 4 ,5 ,6, 7 ,8 ,9, 0);
        System.out.println("Using forEach with parallel stream");
        digits.parallelStream().forEach(System.out::println);  // ulte pulte number dega

        // using forEachOrdered
        System.out.println("Using ForEachOrdered with parallel stream");
        digits.parallelStream().forEachOrdered(System.out::println);  // ab order maintain hoga


    }
}
