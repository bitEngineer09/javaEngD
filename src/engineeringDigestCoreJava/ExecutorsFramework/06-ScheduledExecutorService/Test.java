package engineeringDigestCoreJava.ExecutorsFramework.ScheduledExecutorService;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> System.out.println("Task executed after 5 sec delay"), 5,
                TimeUnit.SECONDS); // esme queue me jaane ke baad kaam hota hai

        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task is executed after 5 seconds.");
            },
                5,
                5,
                TimeUnit.SECONDS
                );

        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task is executed after 3 seconds.");
        },3, 3, TimeUnit.SECONDS);


        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task will be executed after every 2 sec delay"),
                2, // intially etne seconds ka delay hoga
                2,          // har do seconds ke baad execute hoga
                TimeUnit.SECONDS
                );          // interval me kaam karega

// yaha bhi jab queue me kaam jaaye to ho sakta hai ki utna time hee naa mile,
// kyuki intervals me kaam ho ra hai and shutdown ho jaaega

// ese fir khud se handle karna padega
        scheduler.schedule(() -> { // ye hum khud se kiya taaki extra time mil jaaye
            System.out.println("Shutdown is initiating"); // 20 sec baad print hoga
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
//        scheduler.shutdown();
    }
}
