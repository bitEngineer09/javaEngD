package _1_engineeringDigestCoreJava._3_ExecutorsFramework.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class getWithoutTime {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor(); // Executors ek class hai, jiska method hai newSingle.....

        java.util.concurrent.Future<Integer> future = executor.submit(() -> 42);
//      Future<?> num = executor.submit(()-> 42); question mark ka matlab ki ab ye khud datatype pata karega.
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        if(future.isDone()){ // agar kaam ho gaya to ye print karva do
                             // agar ese es case .get() se pehle apply kar diya to 'null' return karega, means ki koi kaam nahi hua hai.
            System.out.println("First task is done.");
        }


        java.util.concurrent.Future<String> name = executor.submit(() -> "Gautam");
        try{
            System.out.println(name.get());
        }catch (InterruptedException e){
            throw new RuntimeException (e);
        }catch(ExecutionException e){
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}