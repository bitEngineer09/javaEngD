package CollectionFramework.one_ListInterface.ArrayList.ComparatorEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}


public class Test {
    public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student("Gautam", 8.4));
    students.add(new Student("Lalit", 7.0));
    students.add(new Student("Aman", 8.3));
    students.add(new Student("Manas", 9.0));
//    yaha koi natural ordering jaisa nahi hai, matlab ki do datatype hai String and Integer

    students.sort((a, b) -> {
        if (b.getGPA() - a.getGPA() > 0) {
            return 1;
        }
        else if (b.getGPA() - a.getGPA() < 0) {
            return -1;
        }
        else {
            return 0;
        }
    });
    
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getGPA());
        }

    }
}
