package engineeringDigestCoreJava.com.engineeringdigest.corejava.Enum;
/// es switch case me 'break' daalne ki jarurat nahi hai
public class switchCase {

    public static enum Months {
        jan, feb, march, april, may, june, july, aug, sep, oct, nov, dec
    }

    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        switch (day){
            case MONDAY -> System.out.println("Today is Monday.");
            case TUESDAY -> System.out.println("Today is tuesday");
            default -> System.out.println("Today is Weekend");
        }
//        Day n = Day.TUESDAY;
//            String res = switch(n){ // another way
//            case MONDAY -> "somwar"; // yaha somwar return ho ra hai
//            case TUESDAY -> "magalwar";
//            default -> "Anya din";
//        };
//        System.out.println(res);

        Months month = Months.jan;
        Months[] value = Months.values();
        for (Months i : value){
            System.out.println(i);
        }
    }
}
