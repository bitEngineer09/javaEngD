package _1_engineeringDigestCoreJava._3_ExecutorsFramework.CyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Main {
    public static void main(String[] args) {
        int services = 3;
        ExecutorService service = Executors.newFixedThreadPool(services);
        CyclicBarrier barrier = new CyclicBarrier(services); // one barrier
//        CyclicBarrier barrier1 = new CyclicBarrier(services); // two barriers
        service.submit(new DependentService(barrier));
        service.submit(new DependentService(barrier));
        service.submit(new DependentService(barrier));
        System.out.println("Main");

//
        service.shutdown();
    }
}

class DependentService implements Callable<String> {

    private final CyclicBarrier barrier;
    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " started service.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is awaiting at the barrier.");
        barrier.await(); // yehi wait hoga har worker thread ke liye
        // jab saare yaha aa jaaenge tabhi execute karenge
        return "Ok";
    }
}
