package _1_engineeringDigestCoreJava._4_Generics.BoundedParameters;

interface Printable {
    void print();
}
class MyNumber extends Number implements Printable {

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My Number: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Baksa <T extends Number & Printable> {

    // eske Syntax me pehle hamesha class hogi, and fir Interface
    // ye esliye ho ra hai kyuki java me multiple inheritance to allowed hai nahi
    // eska matlab ki T ki jagah vo class aa sakti hai jo Number ko
    // extend kar ra ho and Printable ko implement kare

    private T item;

    public Baksa (T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }

}


public class Test {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(34);
        Baksa<MyNumber> boxx = new Baksa<>(number); // yaha humne <> class pass kari hai
        boxx.display();
    }
}
