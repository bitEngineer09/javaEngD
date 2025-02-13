package engineeringDigestCoreJava.Generics.GenricInterface;

//  You declare a generic interface in the same way,
//  you would declare a generic class or method

public interface Container<T> {
    //  ye humne Ek container interface banaya Genric type ka.

    void add(T item);
    T get();
}
