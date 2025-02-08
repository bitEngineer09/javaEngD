package ExecutorsFramework.countdownLatch;

import java.util.concurrent.*;

public class WhereToUseCDLatch {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> dependentSerivece1 = executor.submit(new dependentServices());
        Future<String> dependentSerivece2 = executor.submit(new dependentServices());
        Future<String> dependentSerivece3 = executor.submit(new dependentServices());

        // hum ye maan re hai ki ye alag alag dependent Services hai, sab apna apna kaam karengi,
        // to suppose bht saari dependent service hongi, to hume baar baar get karna padega.
        // yaa hum inokeAll bhi use kar sakte hai, but it increases complexity.
        // Therfore use countdownLatch.

        try{
            dependentSerivece1.get(); // eska matlab ki hum wait kar re hai ki ye kaam pehle pura khatam ho jaaye.
            dependentSerivece2.get();
            dependentSerivece3.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All dependent services has finished. Starting the main service.");
        executor.shutdown();
    }
}
class dependentServices implements Callable<String> {
    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " Service Started"); // yaha string ke badle Object likha hota hai,
        Thread.sleep(2000);  // humne String pass kiya ki koi String value return karega.
        return "Service runs..";  // yaha by-default return null hota hai
    }
}
