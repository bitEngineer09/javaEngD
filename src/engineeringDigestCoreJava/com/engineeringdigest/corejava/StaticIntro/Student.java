package engineeringDigestCoreJava.com.engineeringdigest.corejava.StaticIntro;

public class Student {
    private String name;
    private int rollNumber;
    private static String school = "St columbus";
    private static int count = 0;
    public Student(){
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public static String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static int getCount() {
        return count;
    }
}
