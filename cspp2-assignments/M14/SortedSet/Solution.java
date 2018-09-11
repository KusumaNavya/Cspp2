import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /**
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
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        SortedSet s = new SortedSet();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
             case "size":
                 System.out.println(s.size());
                 break;
             case "contains":
                 System.out.println(s.
                     contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "addAll":
                int[] intArray = intArray(tokens[1]);
                 if (intArray.length == 1) {
                     s.add(intArray[0]);
                 } else {
                     s.add(intArray);
                }
                 break;
            case "subSet":
                String[] arrstring = tokens[1].split(",");
                if (Integer.parseInt(arrstring[0])
                      > Integer.parseInt(arrstring[1])) {
                    System.out.println("Invalid Arguments to Subset Exception");
                } else {
                    int[] subarray = s.subSet(Integer.parseInt(arrstring[0]),
                            Integer.parseInt(arrstring[1]));
                    Set subset = new Set();
                    subset.add(subarray);
                    if (subset != null) {
                        System.out.println(subset);
                    }
                }
                break;
            case "headSet":
                int[] headarray = s.headset(Integer.parseInt(tokens[1]));
                Set headset = new Set();
                headset.add(headarray);
                if (headset != null) {
                    System.out.println(headset);
                }
                break;
            case "last":
                System.out.println(s.last());
                break;
            default:
                break;
            }
        }
    }
}
