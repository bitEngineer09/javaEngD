package _1_engineeringDigestCoreJava._4_Generics.Intro;

public class Pair<K, V> {

    private K key;

    private V value;

    public Pair (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey () {
        return key;
    }

    public void setKey (K key) {
        this.key = key;
    }

    public V getValue () {
        return value;
    }

    public void setValue (V value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Pair<String,  Integer> pair = new Pair<>("Age", 22);
//        pair.setKey("name");
//        pair.setValue("Gautam");
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());

        System.out.println("Pair: " + pair.getKey() );
        System.out.println("Value: " + pair.getValue() );

    }
}
