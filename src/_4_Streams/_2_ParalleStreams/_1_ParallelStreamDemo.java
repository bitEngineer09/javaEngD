package _4_Streams._2_ParalleStreams;

// A type of stream that enables parallel processing of elements.
// Allowing multiple threads to process parts of the stream simultaneously.
// This can significantly improve performance for large data sets.
// workload is distributed across multiple threads.
// Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent.
// They may add overhead for simple tasks or small datasets.

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class _1_ParallelStreamDemo {
    public static void main(String[] args) {


//----------------Without parallel Stream-----------------------------
        long startTime = System.currentTimeMillis();

        List<Integer> listOfNumbers = Stream.iterate(1, x -> x + 1).limit(20000).toList();
//        List<Long> FactorialResult = listOfNumbers.stream().map(x -> factorial(x)).toList();
        List<Long> FactorialsList = listOfNumbers.stream().map(_1_ParallelStreamDemo::factorial).toList();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken with  Sequential Stream: " + (endTime - startTime) + " ms");



//----------------Using parallel Stream-----------------------------
        long startTime1 = System.currentTimeMillis();

        List<Integer> number = Stream.iterate(1, x -> x + 1).limit(20000).toList();
//        List<Long> FactorialList1 = number.stream().map(x -> factorial(x)).toList();
        List<Long> FactorialList1 = number.parallelStream().map(_1_ParallelStreamDemo::factorial).toList();
        long endTime1 = System.currentTimeMillis();

        System.out.println("Time taken with Parallel Stream: " + (endTime1 - startTime1) + " ms");

//---------------Cumulative Sum-------------------------------------
        // [1, 2, 3, 4, 5] --> [1, 3, 6, 10, 15]

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

//        int sum = 0;
//        List<Integer> cumulativeSum = numbers.parallelStream().map(x ->
//        {
//            int i = x + sum;    // yaha ye bol ra hai: Variable used in lambda expression should be final or effectively final.
//                                // lamba exp me local var tabhi use kar paate hai jab vo final ho yaa fir effectively final ho.
//                                // but yaha to sum change hoga na to use final kaise declare kar sakte hai
                                  // so use AtomicInteger to achieve Thread Safety
//            sum = i;
//            return i;
//        }).toList();


        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList(); // sum.addAndGet() -> Atomically adds the given value to the current value
            // sum.addAndGet(x) x ko add kar dega sum me, and jo result aaega use get bhi kar lega

//        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();  // Method Ref
        System.out.println("Expected Output -> [1, 3, 6, 10, 15]");
        System.out.println("Real Output -> " + cumulativeSum); // ulta pulta aaega kyuki ye independent nahi hai
        // parallely hum vo kaam karate hai jo independent hota hai, but ye independent thodi na hai, esliye har jagah parallel streams use nahi karte.


//---------Parallel Streams To Sequential---------------------

        // .sequential()
//        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).sequential().toList();


    }
    private static long factorial(int number) {
        long result = 1;
        while (number > 0) {
            result *= number;
            number -= 1;
        }
        return result;
    }
}


