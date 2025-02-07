package ExecutorsFramework.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class cancel {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("Hello Thread");
            return 2 + 3;
        });

        try{
            Thread.sleep(1000);
            // ye humne sleep esliye karvaya taaki do seconds
            // ke baad uper vale thread ko ek second ka mauka mil jaaye chalne ka.
        }catch(InterruptedException e){

        }

//        future.cancel(true); // tasks ko cancel kar dega
        future.cancel(false); // agar chal ra hai to interrupt nahi karega
//        es case me hamara pgm chal ra hai to ye interrupt nahi karega.
        System.out.println(future.isDone());    // true hee return karega

        System.out.println(future.isCancelled());
        executor.shutdown();
    }
}
