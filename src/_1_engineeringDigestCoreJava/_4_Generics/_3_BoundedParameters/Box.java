package _1_engineeringDigestCoreJava._4_Generics.BoundedParameters;

public class Box<T extends Number> {
    // T pe boundation laga re hai
    // Number class super class hai.
    // float, integer, double, etc sab esko extend karte hai

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue () {
        return this.value;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        Box<Float> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
//        Box<String> box3 = new Box<>(); // not allowed
    }
}
