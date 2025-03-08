package _3_Java8_Basics;

public class _1_LambdaExp {
    public static void main(String[] args) {
        // Java 8 --> minimal code, functional programing
        // Java 8 --> Lambda expression, Streams, Date & Time API

        // LAMBDA EXPRESSION -->
        // lambda expression is an anonymous function ( no name, no return type, no access modifier )
        // It is used to implements Functional Interface.


//            Thread t1 = new Thread(new apple());   // hume ye sab karna ra tha just to use run method
        //    class apple implements Runnable {
        //         @Override
        //        public void run() {}
        //   }


// * So now using lambda Expression

        // methods ke constructor and brackets ke beech -> laga do

        Thread t1 = new Thread(() -> {  // hume class banane ki bhi jarurat nhi hai
            System.out.println("Hello");
        });


//        Other Example
        MathOperation sum = (int a, int b) -> { return a + b; };
        // sum functionalInterface ka refernce hai

        // single return line ko hata bhi sakte hai, uske saath brackets ko bhi hatana padega
        MathOperation sum1 = (int a, int b) -> a + b;

        // same datatype ho to use hata skate hai
        MathOperation sum2 = (a, b) -> a + b;

        MathOperation sub = (a, b) -> a - b;

        // Now to use this
        sub.operate(23,56);

        // NOTE -> Yaha (a, b) -> a+ b; ek function hai, jise hum as varibale treat kar re hai
        // This is called Functional programming
    }
}

@FunctionalInterface      // ye lagane se hua ki aage jo koi bhi change karega ese vo samjh jaaye ki ye ek function interface hai, and fir esme koi or abstract method naa daal de.
interface MathOperation { // functional interface
    int operate (int a, int b);
}


