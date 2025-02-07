package ExecutorsFramework.CallableRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// kuch bhi return karana hai to Callable use karo
// nahi karana to Runnable use karo

public class submit {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(()->42); // yaha by-default callable vala submit chalta hai

        // * Runnable interface me hum dekh sakte hai ki only run method hai, and vo kuch return nahi karata.
        //   so agar runnable me hum koi return statements daalenege to error show karega.
        // * Therefore hum abhi tak jo bhi return kara rahe the submit me, vo by-default
        //   callable type me jaa raha tha, naaki runnable type vale me.

//      Runnable runnable = ()-> "hello";  ERROR
        Callable<?> callable = () -> "hello";  // callable kuch bhi return kar sakta hai.

        Callable<String> call = () -> "hello"; // also true (Better way as type is defined)
                                               // callable baksa hai jisme String rakha hai

        Callable call1 = () -> "hello";        // also true

//      NOTE --> even though runnable kuch return nahi karta, but submit future return karta hai.
        Future<?> future = executor.submit(() -> System.out.println("Hello Thread"));
//      yaha Runnable automatically call hua and vo kuch return nahi kar
//        raha hai, but submit Future return kar raha hai.

        Future<?> future1 = executor.submit(() -> System.out.println("Runnable does not return"), "success" );
        // this is of type submit(r, return), submit hone ke baad (result : "success"), return matlab jaega future me.

        executor.shutdown();
    }
}

