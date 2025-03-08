package _1_engineeringDigestCoreJava._4_Generics.GenricInterface;

public class GenericContainer<T> implements Container<T> {
//  fir ek Class banaya Generic Type ka,
//  jo implement kar raha hai container interface ko

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return this.item;
    }
}
