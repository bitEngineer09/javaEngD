package _1_engineeringDigestCoreJava._3_ExecutorsFramework.countdownLatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleOfCDLatch {
    public static void main(String[] args) {
        int numberOfServices = 3; // number of tasks jiske liye hume main thread ko wait karana hai.
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch Latch = new CountDownLatch(numberOfServices); // humne ye Latch ka obj banaya hai
        executor.submit(new DependentService(Latch)); // fir jitne bhi kaam hai sab me Latch daal diya
        executor.submit(new DependentService(Latch));
        executor.submit(new DependentService(Latch));
        try {
            Latch.await(); // .await IE throw karta hai, main method will wait here
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All dependent services has finished. Starting the main service.");
        executor.shutdown();
    }
}

class DependentService implements Callable<String> {

    private final CountDownLatch Latch;
    // ese final esliye taaki dubara se reassign naa kar sake.

    public DependentService(CountDownLatch Latch){
        this.Latch = Latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " Service Started");
            Thread.sleep(2000);
        }finally {
            Latch.countDown();
        }
        return "Service runs.";
    }
}
