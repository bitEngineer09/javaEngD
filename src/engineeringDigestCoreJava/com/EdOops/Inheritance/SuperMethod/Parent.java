package engineeringDigestCoreJava.com.EdOops.Inheritance.SuperMethod;

public class Parent extends Grandparent {

    public Parent(String eyeColor, int height) {
        super(eyeColor, height);

    }

    public void parent() {
        System.out.println("Parent method called.");
    }
}
