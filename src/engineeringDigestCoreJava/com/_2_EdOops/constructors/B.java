package engineeringDigestCoreJava.com._2_EdOops.constructors;
// constructor overloading
// same class me same cons. but with different arguments

public class B {
    private String name;
    private int age;
    private String company;

    public B(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public B (String name, String company){
        this.name = name;
        this.company = company;
    }

    public B (String name, int age){
        this.name = name;
        this.age = age;
    }
}
