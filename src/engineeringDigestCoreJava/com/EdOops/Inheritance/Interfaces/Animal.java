package engineeringDigestCoreJava.com.EdOops.Inheritance.Interfaces;

public interface Animal {
    public abstract void eat(); // interface methods by default public and abstract hote hai.
    void sleep();               // future classes enhe implement karengi.

    public static final int Max_Age = 34; // fade vale words means ki vo by defualt hai.

    static void info(){
        System.out.println("This can be accessed by interface name"); // see in test
    }

    default void run() {
        System.out.println("Animal is running.");
    }

}
