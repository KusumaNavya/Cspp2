import java.util.Scanner;
/**.
     * { item_description }.
     */
public final class Concatinate {
    /**
     * { item_description }.
     */
    private Concatinate() {
    }
    /**
     * . { item_description }.
     *
     * @param      s1    The s 1
     *
     * @return     { description_of_the_return_value }
     */
    public static String helloName(final String s1) {
        String str = new String("Hello ");
        return str.concat(s1) + "!";
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println(helloName(str1));
    }
}
