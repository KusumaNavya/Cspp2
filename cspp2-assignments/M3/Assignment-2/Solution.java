/**no of 7s.
*
*/
import java.util.Scanner;
/**
    Do not modify this main function.
    */
public class Solution {
    /**no of 7s.
*
*/
    private static final int SEVEN = 7;
    /**no of 7s.
*
*/
    private static final int TEN = 10;
/**
 * . Fill the main function to print the number of 7's between 1 to n
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int i;
        for (i = 1; i < n; i += 1) {
            int temp = i;
            while (temp != 0) {
                if (temp % TEN == SEVEN) {
                count = count + 1;
                }
                temp = temp / TEN;

            }
        }
        System.out.println(count);
    }
}
