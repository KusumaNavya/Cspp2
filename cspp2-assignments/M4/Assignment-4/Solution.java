/**.
 * { Given an String, Write a java method that returns the decimal
 * value for the given binary string. }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /*
    Do not modify the main function
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
     * @param      str   The string
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(final String str) {
        /**.
         * { var_description }
         */
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
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
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function
}
