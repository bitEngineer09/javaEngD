package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.loops;

public class br_and_continue {
    public static void main(String[] args) {
//        BREAK
        int i = 1;
        while (i < 100){
            if (i == 50){
                break;   // use to get out of loop
            }
            System.out.println(i);
            i++;
        }
        System.out.println("br");

//        CONTINUE
        int j = 1;
        while (j <= 10){
            if (j == 5){
                j++; /* coz agar ye nahi rahega to loop 5 ke baad chalega hee nahi vo har baar 5 pe hee check karta rahega (infinite loop).
                    therefore humne j++ kiya taaki 5 aane ke baad vo badh jaaye and hamara condition aage chale.*/

                continue; // skips the iteration

            }
            System.out.println(j);
            j++;
        }


//        in case of "for loop", NO NEED of adding extra increament.
        for (int k = 1; k <= 11; k++){
            if (k == 5){
                continue;
            }
            System.out.println(k);
        }
    }
}
