package _1_engineeringDigestCoreJava._1_com._2_EdOops._4_Inheritance.multilvl;

public class Parent extends GrandParent {

    @Override
    public void greet () {
        System.out.println("Namaste");
    }

    public Parent() {
        System.out.println("Parent constructor called.");
    }
}
