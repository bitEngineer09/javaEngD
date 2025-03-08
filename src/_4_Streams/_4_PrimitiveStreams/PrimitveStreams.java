package _4_Streams._4_PrimitiveStreams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitveStreams {
    public static void main(String[] args) {
        // 1. Agar hum primitive data ke saath khel rahe hai khaaskar vo bhi int ke saath,
        //      to IntStream use Karna padega
        // IntStream -> aise hee bht hai explore kar le


        int[] numbers = {1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(numbers);  // IntStream is a interface
//        Stream<Integer> boxed = intStream.boxed(); // ab box me convert ho gaya

        System.out.println(IntStream.range(1, 4).boxed().collect(Collectors.toList())); // 1 inclusive and 4 exclusive
        // boxed Wrapper class means Stream me convert kar deta hai, tabhi uske methods use kar paaenge

        System.out.println(IntStream.rangeClosed(1, 4).boxed().collect(Collectors.toList())); // both inclusive

        IntStream.of(1, 2, 3, 4, 5);

        DoubleStream doubles = new Random().doubles(5); // doubles() me stream size pass hoga
        // ek double ke stream banayi hai jisme 5 random doubles hai

//        System.out.println(doubles.sum());
//        System.out.println(doubles.min());
//        System.out.println(doubles.max());
//        System.out.println(doubles.average());
//        doubles.summaryStatistics()
//        doubles.mapToInt(x -> (int) (x + 1)); // uch karvake return karva do

        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
//        System.out.println(ints.boxed().toList());
        System.out.println(ints.sum()); // uper vale ko comment esliye karna pada kyuki sum() terminal operation hai, ye karte hee band ho jaaega operation.
        // aise hee bht saare methods hai
    }
}
