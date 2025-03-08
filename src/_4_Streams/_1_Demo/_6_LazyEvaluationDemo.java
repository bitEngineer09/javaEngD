package _4_Streams._1_Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _6_LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALice", "Bob", "Charlie", "David");

        Stream<String> namesStream = names.stream()
                .filter( name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });
//  1. yaha terminal operation nahi chala hai, so uper vala operation chalega hee nahi.
//  2. neeche vali statement uper vale operation se pehle execute ho jaaega, halaki baad me hona chahiye tha
        System.out.println("Before Terminal Operation");

        List<String> result = namesStream.collect(Collectors.toList());

        System.out.println("After Terminal Operation");
        System.out.println(result);
    }
}
