import java.util.Scanner;
 /**
    *
    **/
public final class Solution {
     /**
    *
    **/
    private Solution() {
    }
    /**
    @param args Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        double result = power(base, exponent);
        System.out.println((long) result);
    }
    /**
    @param base Need to write the power function and print the output.
    @param exponent Need to write the power function and print the output.
    @return double**/
    public static double power(final int base, final int exponent) {
        return Math.pow(base, exponent);
    }
}
