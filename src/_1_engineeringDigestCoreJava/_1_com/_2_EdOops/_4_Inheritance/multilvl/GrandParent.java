package _1_engineeringDigestCoreJava._1_com._2_EdOops._4_Inheritance.multilvl;

public class GrandParent {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void greet() {
        System.out.println("pranam");
    }

    public GrandParent() {
        System.out.println("GrandParent constructor called.");
    }
}
