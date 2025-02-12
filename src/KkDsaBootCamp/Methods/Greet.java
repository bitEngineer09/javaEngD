package KkDsaBootCamp.Methods;

public class Greet {
    public static void main(String[] args) {
        String gautam = greetEmp("Gautam");
        System.out.println(gautam);
    }
    static String greetEmp(String empName) {
        String message = "Hello " + empName;
        return message;
    }
}
