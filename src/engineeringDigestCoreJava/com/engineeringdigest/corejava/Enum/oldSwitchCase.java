package engineeringDigestCoreJava.com.engineeringdigest.corejava.Enum;

public class oldSwitchCase {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY: {
                System.out.println("Day 1");
            }
            case TUESDAY: {
                System.out.println("Day 2");
            }
            case WEDNESDAY: {
                System.out.println("Day 3");
            }
            default: {
                System.out.println("Weekend");
            }
        }
    }
}
