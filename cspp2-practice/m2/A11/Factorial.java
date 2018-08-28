import java.util.Scanner;
/**
* Class for factorial.
*/
public final class Factorial {
    /**
    *
    **/
   private Factorial() {
}
    /**
     * Constructs the object.
     *
     * @param n { parameter_description }
     @return int*/
    public static int fact(final int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

        }

    /**.
    * { function_description }
    *
    * @param args  The arguments
    */
    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(fact(n));

   }
}
