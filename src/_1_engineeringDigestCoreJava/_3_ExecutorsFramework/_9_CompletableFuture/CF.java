package _1_engineeringDigestCoreJava._3_ExecutorsFramework.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// introduced in java 8 to handle asynchronous programming.
// MultiThreading is used to achieve asynnc. behavoiur.
// CF me asyn. task ko run karva sakte hai
// esme CF hee return hota hai jisme, result uske kaam ka computation hoga.

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            }catch (InterruptedException i) {

            }
            return "Done";
        });
        String s = completableFuture.get();
        String b = completableFuture.getNow("noo");
        // agar kuch return nahi hua, yaa fir worker Thread vala kaam complete nahi hoga
        //   to eske ander vala return hoga
        // check kar liyo get ko comment karke

        System.out.println(s);
        System.out.println("main");

    }
}
