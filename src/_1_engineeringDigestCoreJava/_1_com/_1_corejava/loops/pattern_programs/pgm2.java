package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.loops.pattern_programs;
/*
*   *****
*   *   *
*   *   *
*   *****
*
* */
public class pgm2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 5; j++){
                if (i == 1 || j == 1 || i == 4 || j ==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
