import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
    /**magic number.
*
*/
    private static final int THREE = 3;
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        int c;
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                c = 0;
                for (int j = THREE; j < i; j++) {
                    if (i % j == 0) {
                        c++;
                    }
                } if (c > 0) {
                    System.out.println(i);
                }
            }
        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}
