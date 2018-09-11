import java.util.Scanner;
import java.util.Arrays;
/**.
 * List of .
 */
public class SortedSet extends Set {
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int last() {
        if (size() == 0) {
            System.out.println("Set Empty Exception");
            return -1;
        } else {
            return get(size() - 1);
        }
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            int index = getIndex(item);
            add(index, item);
        }
    }
    /**.
     * Gets the index.
     *
     * @param      item  The item
     *
     * @return     The index.
     */
    public int getIndex(final int item) {
        for (int i = 0; i < size(); i++) {
            if (item <= this.get(i)) {
                return i;
            }
        }
        return size();
    }
    /**.
     * { function_description }
     *
     * @param      fromele  The fromele
     * @param      toele    The toele
     *
     * @return     { description_of_the_return_value }
     */
    public int[] subSet(final int fromele, final int toele) {
        int fromindex = getIndex(fromele);
        int toindex = getIndex(toele);
        int[] subset = new int[toindex - fromindex];
        int k = 0;
        for (int i = fromindex; i < toindex; i++) {
                subset[k++] = this.get(i);
        }
        return subset;
    }
    /**.
     * { function_description }
     *
     * @param      toele  The toele
     *
     * @return     { description_of_the_return_value }
     */
    public int[] headset(final int toele) {
        return subSet(get(0), toele);
    }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
}