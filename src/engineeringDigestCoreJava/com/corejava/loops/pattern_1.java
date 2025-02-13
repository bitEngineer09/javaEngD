package engineeringDigestCoreJava.com.engineeringdigest.corejava.loops;
/*
*     *
*     * *
*     * * *
*     * * * *
*     * * * * *
*
* */
public class pattern_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){ // means 1 se 6 tak kuch to hona hai, baaki print ka kaam to j loop karega
            for (int j = 1; j <= i ; j++ ){ // for j = 1 then j <= i satisfies, print *
                System.out.print("*"); // jab ye execute hua to j loop se bahar aakar khaali line print karega
            }
            System.out.println(); // khaali line print karega
        }
    }
}
