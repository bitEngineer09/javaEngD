package MultiThreading.ThreadPriority;
/*
MAX_PRIORITY ( = 10)
MIN_PRIORITY ( = 1)
NORM PRIORITY ( = 5)
*/
public class MyThread extends Thread {
    @Override
    public void run(){ // yaha vo kaam likhte hai jo hume dusre thread se karana hota hai
        for (int i = 0; i < 5; i++){
            System.out.println("i : "+ i);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public MyThread(String name){ // hum thread ko name de rahe hai
        super(name);
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Gautam (Low Prority Thread)"); // ye humne tread ka custom name bana diya
        MyThread thread2 = new MyThread("Sakshi (Normal Priority Thread)"); // ye humne tread ka custom name bana diya
        MyThread thread3 = new MyThread("Lali (Max Priority Thread)"); // ye humne tread ka custom name bana diya

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
