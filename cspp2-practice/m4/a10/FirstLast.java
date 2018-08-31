/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * .
 */
public final class FirstLast {
    /**
     * { item_description }.
     */
    private FirstLast() {
    }
    /**
     * { var_description }.
     */
    private static final int SIX = 6;
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(checkforsix(a, n));
    }
    /**
     * { function description }.
     *
     * @param      a   The a
     * @param      n     { parameter description }
     *
     * @return     { descriptionofthereturnvalue }
     */
    public static boolean checkforsix(final int[] a, final int n) {
        return a[0] == SIX || a[n - 1] == SIX;
        }
}