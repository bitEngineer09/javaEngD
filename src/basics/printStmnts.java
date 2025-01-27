package basics;

public class printStmnts {
   /*
       1)  println --> adds a line.
       2)  print --> No.
       3)  printf --> No {It works as C print statement}.
   */
//   NOTE --> use '\n' to create new line in case of print & printf ->{+"\n"}.

    public static void main(String[] args){
        int a = 2;
        int b = 7;
        String c = "SUM";
        System.out.printf(c + " of  " + a + " & " + b + " is : " +(a + b) + "\n");
        System.out.println();
        System.out.printf("%s of %d & %d : %d ", c, a, b, (a + b));
        System.out.println();

        char d = 'A';
        float f = 12.45f; // note --> in floating,  after decimal upto 6 digts aaate hai.
        System.out.printf("%c & %f are character and floating point decimal values.", d, f);

    }
}
