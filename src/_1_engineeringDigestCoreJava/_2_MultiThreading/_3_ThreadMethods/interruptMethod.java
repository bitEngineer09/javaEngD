package _1_engineeringDigestCoreJava._2_MultiThreading._3_ThreadMethods;

public class interruptMethod extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
                System.out.println("Thread is sleeping");
            }catch (Exception e){
                System.out.println(e);
            }
    }

    public interruptMethod(String name) {
        super(name);
    }

    public static void main(String[] args) {
        interruptMethod t1 = new interruptMethod("MyThread");
        t1.start();
        t1.interrupt(); // main method t1 ko rok dega vo jis bhi state me ho.
                        // yaha t1 so raha tha use main method interrupt kar dega.

        System.out.println(Thread.currentThread().getName());
    }
}
