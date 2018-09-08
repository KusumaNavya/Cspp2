import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Navya
 */
class Set {
    //your code goes here...
    //Good luck :-)
    private int[] list; 
    private int size = 0;
    /**
     * { item_description }.
     */
    private static final int TEN = 10;
    
    /**
     * Constructs the object.
     */
    public Set () {
        this.list = new int[TEN];
        this.size = 0;
    }
    /**Size method.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }

    /**Contains method returns a boolean.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }    
        }
        return false;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "{";
        for (int i = 0; i < size - 1; i++) {
            s += list[i] + ",";
        }
        s += list[size - 1] + "}";
        return s;
    }

    
    /**Resize method
     * { function_description }
     */
    private void resize() {
        list = Arrays.copyOf(list, 2 * size);
    }

    /** Add method
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(int item) {
        // if (list.contains(item)) {
        //     if (size >= list.length) {
        //         resize();
        //         list[size++] = item;
        //     }
        //     list[size++] = item;
        // }
        for (int i = 0; i < size; i++) {
            if (list[i] != item) {
                list[size++] = item; 
            }
        }
    }

    /**Add all elements in the array if element is not present in the list
     * { function_description }
     *
     * @param      newA  The new a
     */
    public void add(int[] newA) {
        if (size + newA.length >= list.length) {
            resize();
       }
        for (int i = 0; i < newA.length; i++) {
            // if (list.contains(newA[i])) {
            //     add(newA[i]);
            // }
            for (int j = 0; j <= size; j++) {
                if (newA[i] != list[j]) {
                    add(newA[i]);
                }
            }
        }
    }

    /**
     * { function_description }
     *
     * @param      A     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Set intersection(Set newS) {

    return newS;
    }

    // public Set retainAll(int[] newA) {
    //     return ;
    // }

    public int[][] cartesianProduct(Set newS) {
        int[][] a =  {
      {1, 2, 3}, 
      {4, 5, 6, 9}, 
      {7},};
        return a;
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
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
   
    /** 
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
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
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                // case "retainAll":
                // s = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // System.out.println(s.retainAll(intArray));
                // break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
