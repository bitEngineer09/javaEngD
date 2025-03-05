package engineeringDigestCoreJava.com._2_EdOops.Inheritance.multilvl;

public class Parent extends GrandParent {

    @Override
    public void greet () {
        System.out.println("Namaste");
    }

    public Parent() {
        System.out.println("Parent constructor called.");
    }
}
