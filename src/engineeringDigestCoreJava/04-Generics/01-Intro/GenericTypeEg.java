package engineeringDigestCoreJava.Generics.Intro;

public class GenericTypeEg {
    static class BOX<T> {

        // 'T' here specifies that yaha koi bhi dataType ho sakta hai
        // T just as a variable hee hai
        // According to convention ye bass single letter ka hee hona chahiye

        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BOX<Integer> box = new BOX<>();
        box.setValue(23);
        int i = box.getValue();  // BOX is now TypeSafe
        System.out.println(i);

        BOX<String> boxString = new BOX<>();
        boxString.setValue("engineeringDigestCoreJava/Generics");
    }
}
