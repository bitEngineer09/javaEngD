package _1_engineeringDigestCoreJava._3_ExecutorsFramework.future;

import java.util.concurrent.*;

public class getWithTime {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            return 2 + 3;
        });
        Integer i = null;

            try {

                i = future.get(1, TimeUnit.SECONDS); // agar ek sec me kaam nahi hua to exception throw kar dega.
                System.out.println(i);
                System.out.println(future.isDone());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                System.out.println("Exception occured: " + e);
            }

        executor.shutdown();

        }
}
