package _1_engineeringDigestCoreJava._1_com._2_EdOops._4_Inheritance.SuperMethod;

public class Parent extends Grandparent {

    public Parent(String eyeColor, int height) {
        super(eyeColor, height);

    }

    public void parent() {
        System.out.println("Parent method called.");
    }
}
