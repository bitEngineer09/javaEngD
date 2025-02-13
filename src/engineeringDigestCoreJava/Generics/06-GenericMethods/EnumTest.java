package engineeringDigestCoreJava.Generics.GenericMethods;

enum Operation {
    ADDITION, SUBTRACTION, MULTIPLY, DIVIDE;
    // ab humare pass do option hai ki
    // yaa to sabke operations ke alag alag method banao,
    // yaa fir Ek generic method bana lo

    public <T extends Number> double apply(T a, T b) {
        switch (this) { // esse pata lag jaaega ki method me
                        // konsa instance call hua hai
            case ADDITION:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACTION:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Operation.ADDITION.apply(2, 3));
    }
}
