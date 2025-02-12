package engineeringDigestCoreJava.MultiThreading.LifeCycle;

public class lifeCycle extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("RUNNING");
        try {
            Thread.sleep(5000);// 2 seconds, state -> TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " waiting is completed");
    }

    public static void main(String[] args) throws InterruptedException{
        // yaha ba jo bhi kaam hoga main me, vo MAIN THREAD execute karega
        lifeCycle t1 = new lifeCycle();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        System.out.println(Thread.currentThread().getState()); // RUNABBLE
//  upper running hona chahiye, but nahi hoga kyuki State ek enum class hai,
//  and usme Running hai hee nahi, runnable hee running me jata hai.

        Thread.sleep(100); // main thread ko pause karega 100 milisec ke liye
        System.out.println(t1.getState());

        t1.join(); // es thread ka caller wait karega ki pehle ye thread kaam khatam kare, Main method will wait for t1 to be finished.
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getName());

    }
}
