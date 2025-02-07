package ExecutorsFramework;

import java.util.concurrent.ExecutorService;  // ye interface hai extends karta hai Executor interface ko
import java.util.concurrent.Executors;        // Executors ek class hai
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); // ye current time bataega in millis form 1 jan 1970
                                                     // It is a standard time.

        ExecutorService executor = Executors.newFixedThreadPool(9); // esme hum number of Threads as a parameter pass karenge
                                                                            // jitne jyada Threads rahenge utni jaldi kaaam hoga.
        for (int i = 1; i <= 10; i++){
            int finalI = i;               // ye ese esliye dala kyuki multiple thread varna fir alag alag 'i' ki value le lete.
            executor.submit(() -> {       // ab yaha saare kaam jo pehle threads kar ra tha, ab executor internally karega.
                long result = Factorial(finalI);
                System.out.println(result);
            });
        }
        // executor apne aap band nahi hota, ese manually band karna padta hai
        executor.shutdown();
                                // ab ye naye task ko accept karna band kar dega
                                // ye orderly shutdown karna shuru kar deta hai.
                                // pura complete hone se pehele previously submitted tasks ko complete hone ka wait karega.

        // ye neeche vali statement pehle hee print ho jaaega, but hume to baad me chahiye, therefore awaitTermination kiya
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }


    private static long Factorial(int num) {

        try{
            Thread.sleep(1000); // hum maan ke chah re hai ki factorial,
                                     // bht heavy task hai vo ek second le ra hai ek factorial nikaalne me
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        long res = 1;
        for (int i = num; i > 0; i--){
            res *= i;
        }
        return res;
    }
}
