/**.
 * {Given an String, Write a java method that returns the
 * decimal value for the given binary string.}
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /*
    Do not modify this main function.
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
     * @param      num   The number
     *
     * @return     { description_of_the_return_value }
     */
    public static int binaryToDecimal(final String num) {
        /**.
         * { var_description }
         */
         int decimal = Integer.parseInt(num, 2);
            return decimal;
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
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            int result = 0;
            if (!s.isEmpty()) {
                result = binaryToDecimal(s); //Write binaryToDecimal function
                System.out.println(result);
            }
        }
    }
}
