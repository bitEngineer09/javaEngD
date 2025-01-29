package loops.pattern_programs;
/*
 *     *****
 *     *****
 *     *****
 *     *****
 *     *****
 *
 * */
// ROWS --> outer loops
// COLS --> inner loops

public class pgm1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++){
                for (int j = 1; j <= 5; j++){ // i = 1 pe,  5 baar star ek hee line print karke j loop se bahar aaega.
                    System.out.print("*");
                }
                System.out.println(); // jaise hee ek baar 5 star print ho gaye, then next line me aa jaao
                // fir se loop i = 2 pe chalega, then same process
            }
        }
}
