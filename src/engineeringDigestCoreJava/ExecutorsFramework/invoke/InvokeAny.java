package engineeringDigestCoreJava.ExecutorsFramework.invoke;

// ye bhi with time and w/o time hote hai.
// jo bhi task pehle complete honge, uska result ye dedega, and jo complete nahi honge unhe cancel kar dega.
// ye future return nahi karta, directly result deta hai.

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAny {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);

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

        try{
            Integer i = executor.invokeAny(list); // ye future nahi dega, direct Integer dega
            System.out.println(i);

        }catch(InterruptedException i){

        }catch(ExecutionException e){

        }
        executor.shutdown(); // otuput me ye hoga ki thread chal gaye honge, but
                             // print ek hee hoga jo pehle execute/complete ho gaya hoga, or humne return bhi ek hee karaya hai
    }
}
