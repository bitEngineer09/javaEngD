package engineeringDigestCoreJava.MultiThreading.ThreadUsingLambdaExpression.UnderstandingLambdaExp;

public class Test {
    public static void main(String[] args) {
        /* This is w/o lambda expression
        Student student = new Student(){
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        int res = student.sum(2, 3);
        System.out.println(res);
        */

//        Using Lamda Exp

        Student student = (int a, int b)->{return a + b;};  // es case me datatype nahi daalenge to bhi chal jaaega
        int res = student.sum(23, 44);                 // suppose ek hee argument hota to use w/o brackets bhi likkh sakte hai.

        System.out.println(res);

        Student student2 = (a,b)-> a + b; // agar single statement return hogi to return likhna bhi jaruri nahi hai.

        Student1 EngineeringStudent = name -> {System.out.println(name + " is Engineering Student.");};
        // brackets {middle} bhi lagane ki jarurat nahi hai single statement ke case me.

        Student1 LawStudent = name -> System.out.println(name + " is Law Student.");

    }

}
