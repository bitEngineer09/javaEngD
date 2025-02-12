package engineeringDigestCoreJava.com.engineeringdigest.corejava.Enum;

public class Test {
    public static void main(String[] args) {
        Day monday = Day.MONDAY; // It is like Student student = new Student();
        int ordinal = monday.ordinal();

        System.out.println(ordinal); // prints index
        System.out.println(monday.name());
        System.out.println(monday.toString()); // same as .name()

        Day enumday = Day.valueOf("MONDAY"); // ye loop chalega enum me internally and check karega ki given input enum me hai yaa nahi
                                                  // match hui to return karega, and nahi hui to exception throw karega.
        Day[] values = Day.values();
        for (Day i : values){
            System.out.println(i);
        }

        monday.display();  //using methods

        System.out.println(monday.getLower());
        System.out.println(monday.getDayNum());

        Day tuesday = Day.TUESDAY;
        tuesday.getLower();
        tuesday.getDayNum();
    }
}
