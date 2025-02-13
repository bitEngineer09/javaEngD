package engineeringDigestCoreJava.com.student.understandingClass;

public class studentObj_1 {
    public static void main(String[] args) {
        int a = 34; // Yaha 'a' variable, memory me space lega and usi memory me 34 store hoga.
        Students student = new Students(); // 'new' Students class ka object create kar raha hai
//     student is the refrence variable, which stores the address of object.
//      object ki memory HEAP MEMORY me allocate hoti hai.

        student.name = "Gautam Yadav";
        student.standard = 3;
        student.address = "Haryana 51";
        student.rollNumber = 00063;
        System.out.println(student.name);

    }
}
