import java.util.Scanner;
/**
*
*/
public class Solution {
    /**
    @param args Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
    @param a Need to write the rootsOfQuadraticEquation function.
    @param b Need to write the rootsOfQuadraticEquation function.
    @param c Need to write the rootsOfQuadraticEquation function.
    */
    public static void rootsOfQuadraticEquation(final int a,
                                                final int b,
                                                final int c) {
        /*
        *
        */
        double x = ((b * b) - (4 * a * c));
        double r1, r2;
        r1 = (-b + Math.sqrt(x)) / (2 * a);
        r2 = (-b - Math.sqrt(x)) / (2 * a);
        System.out.println(+r1 + " " + r2);
    }

}
