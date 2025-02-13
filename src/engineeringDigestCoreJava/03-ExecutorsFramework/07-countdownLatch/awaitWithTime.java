package engineeringDigestCoreJava.ExecutorsFramework.countdownLatch;

// es case me main thread 5 sec ke liye wait karega, and
// agar koi service start nahi hui to vo khud pehle chal jaaega.
// uske baad threads chalenge
// But agar fir workerThreads nahi chalvane, then shutdownNow() kar do.

import java.util.concurrent.*;

public class awaitWithTime {

    public static void main(String[] args) {

        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);

        CountDownLatch Latch = new CountDownLatch(numberOfServices); // humne ye Latch ka obj banaya hai

        executor.submit(new dependentService(Latch));
        executor.submit(new dependentService(Latch));
        executor.submit(new dependentService(Latch));

        try {
            Latch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All dependent services has finished. Starting the main service.");
        executor.shutdown();
    }
}

class dependentService implements Callable<String> {

    private final CountDownLatch Latch;

    public dependentService(CountDownLatch Latch){
        this.Latch = Latch;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(6000); // 6 sec ka wait karaya or time limit to 5 sec hee hai
            System.out.println(Thread.currentThread().getName() + " Service Started");
        }finally {
            Latch.countDown();
        }
        return "Service runs.";
    }
}
