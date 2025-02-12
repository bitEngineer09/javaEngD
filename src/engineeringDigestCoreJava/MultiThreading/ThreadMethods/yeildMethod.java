package engineeringDigestCoreJava.MultiThreading.ThreadMethods;

public class yeildMethod extends Thread{

    public yeildMethod(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running.");
        }
        Thread.yield(); // ye nahi daalte to jo thread pehle hai (Thread 1) vahi hamesha pehle chalta,
                        // but ab yield daalne se dusre threads ko bhi mauka dega.
    }

    public static void main(String[] args) {
        yeildMethod thread1 = new yeildMethod("Thread 1");
        yeildMethod thread2 = new yeildMethod("Thread 2");
        thread1.start();
        thread2.start();
    }
}
