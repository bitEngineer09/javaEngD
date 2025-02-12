package engineeringDigestCoreJava.ExecutorsFramework.invoke;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
// invokeAll InterruptedException throw karta hai
// get ExecutionException throw karta hai
// ye multiple tasks ko execute karata hai
// ye main thread ko block karega ki pehle sare threads ko apna kaam karne do fir tum karna

public class InvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<Integer> call1 = () -> {
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> call2 = () -> {
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> call3 = () -> {
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(call1, call2, call3);
        // asList arrays ko convert kar deta hai List me.

        List<Future<Integer>> future = executor.invokeAll(list);
        // future sab callable ka result store kar raha hota hai.

        for (Future<Integer> f : future){
            System.out.println(f.get());
        }

        executor.shutdown();
        System.out.println("Hello Thread"); // ye sabse last me hee print hoga.

    }
}
