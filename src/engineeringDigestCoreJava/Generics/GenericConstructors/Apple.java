package engineeringDigestCoreJava.Generics.GenericConstructors;

public class Apple {
//   yaha class generic nahi hai, but hum generic constructor bana sakte hai
//   fir hum us class me ke constructor me kisi bhi type ka data daal sakte hai

    public <T> Apple(T property) {
    // acces modifier ka ke bad <T> lagane se constructor Generic Constructor ban gaya
    }

    public static void main(String[] args) {
        Apple seb = new Apple("hello");
    }
}
