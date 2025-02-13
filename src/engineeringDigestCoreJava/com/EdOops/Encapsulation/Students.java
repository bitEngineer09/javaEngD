package engineeringDigestCoreJava.com.EdOops.Encapsulation;

public class Students {

    private String name;

    private int rollNumber;

    private int age;

    public void setAge(int age){
        if (age < 0){
            age = 0;
        }
        this.age = age; // this.age vala current object ke variable ko pint kar raha hai, click kar ke dekh le
                        // normal 'age' is an argument of method setAge();
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        if (rollNumber < 0 ){
            System.out.println("IVALID Roll Number..");
        }
        this.rollNumber = rollNumber;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }
}
