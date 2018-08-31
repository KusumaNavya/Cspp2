
import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * { item_description }
     */

    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int i, max;
        for (i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
        }
        max = a[0];
        for (i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }
        System.out.println(max);


    }
}