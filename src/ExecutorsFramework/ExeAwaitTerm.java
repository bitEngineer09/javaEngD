package ExecutorsFramework;

// 1) awaitTermination ek boolean value deta hai
// 2) Returns: true if this executor terminated and false if the
//      timeout elapsed before termination
// 3) Throws InterruptedException

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExeAwaitTerm {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(9);

        for (int i = 1; i <= 10; i++){
            int finalI = i;
            executor.submit(() -> {
                long result = Factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();


//        try {
//            executor.awaitTermination(100, TimeUnit.SECONDS);
//            // hum 100s ke liye wait karenege executor ka, agar saare task complete
//            // ho jaate hai means submit() vale, tab to badhiya, nahi to aage badh jaao.
//        }
//        catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        try{
            while(!executor.awaitTermination(1, TimeUnit.MILLISECONDS)){
                // es given time me agar kaam nahi ho raha hoga to body of loop cahlega.
                System.out.println("Waiting...");
            }
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        // ye neeche vali statement pehle hee print ho jaaega, but hume to baad me chahiye, therefore awaitTermination kiya
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }

    private static long Factorial(int num) {

        try{
            Thread.sleep(1000);  // hum maan ke chah re hai ki factorial,
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
