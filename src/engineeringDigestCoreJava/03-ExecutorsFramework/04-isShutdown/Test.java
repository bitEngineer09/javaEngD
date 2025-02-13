package engineeringDigestCoreJava.ExecutorsFramework.isShutdown;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> future = executor.submit(() -> 1 + 2);
        Integer i = future.get();
        System.out.println("sum is:" + i);
        executor.shutdown();
//        System.out.println(executor.isShutdown()); // ye check karega ki shutdown hua ya nahi

        Thread.sleep(1);
        // ye humne time de diya thoda sa ki, usme saare tasks complete ho jaaenge,
        // varna just shutdown ke baad isTerminate check karoge to false hee bataega.

        System.out.println(executor.isTerminated());
        // ye true return tab karega, jab shutdown karne ke baad,
        // saare tasks complete ho jaaenge.

    }
}
