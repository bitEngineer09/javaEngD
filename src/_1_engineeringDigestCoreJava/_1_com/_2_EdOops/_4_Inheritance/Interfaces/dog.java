package _1_engineeringDigestCoreJava._1_com._2_EdOops._4_Inheritance.Interfaces;

public class dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
