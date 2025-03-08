package _1_engineeringDigestCoreJava._3_ExecutorsFramework.invoke;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
// agar invokeAll me humne time de diya, to ab us given time me,
// jo kaam ho gaya vo ho gaya, fir bache hue kaam cancel ho jaaenge.
// given time me saare kaam nhi hua to CancellationException aaega, use bhi handle karo

public class InvokeAllWithTime {

    public static void main(String[] args) throws CancellationException, InterruptedException, ExecutionException {

        long startTime = System.currentTimeMillis(); // 1 JAN 1970

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> call1 = () -> {
            Thread.sleep(1000);

            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> call2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> call3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(call1, call2, call3);

        List<Future<Integer>> future = executor.invokeAll(list, 1, TimeUnit.SECONDS);
//      sara kaam 1 sec me ho gaya to theek hai, varna bacha hua kaam cancel ho jaaega

        for (Future<Integer> f : future) {
            try{
                System.out.println(f.get());
            }catch(CancellationException c) {

            }
        }

        executor.shutdown();
        System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));
        System.out.println("Hello Thread");
    }
}


