package ExecutorsFramework.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AllOff { // allOf method invokeAll ki tarah hai

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1");
            return "Task 1 is done.";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 2");
            return "Task 2 is done.";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(future1, future2);
        // yaha void esliye hai kyuki, ye yaha futures ka result thodi naa rakhta hai, bass indicate karta hai,
        // saare individual futures complete hue yaa nahi

        f.get();
//        f.join();// ye bhi sakte hai, join throws unchecked exception

        String future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 3");
            return "Task 2 is done.";
        }).get(); // .get directly bhi kar sakte hai

        System.out.println(future3);

        System.out.println("main");
    }
}
