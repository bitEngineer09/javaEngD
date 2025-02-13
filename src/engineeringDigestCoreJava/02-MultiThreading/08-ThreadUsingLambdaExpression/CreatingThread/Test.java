package engineeringDigestCoreJava.MultiThreading.ThreadUsingLambdaExpression.CreatingThread;

public class Test {
    public static void main(String[] args) {
        Runnable task = ()-> System.out.println("Hello");
        Thread t1 = new Thread(task);
//         OR Diretcly write this only
        Thread t2 = new Thread(()-> System.out.println("World"));

        t1.start();
        t2.start();

        Thread t3 = new Thread(()->{ // multiple lines aise likhenge, ese aise samjho ki ye sab likha hai ek implementation class of RUNNABLE.
            for (int i = 1; i <= 4; i++){
                System.out.println("Thread is working.");
            }
        });
    }
}
