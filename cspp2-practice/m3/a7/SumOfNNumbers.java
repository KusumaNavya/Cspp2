import java.util.Scanner;
/**
*
*/
    private Solution() {
        //private function
    }
    /**
*
*/
public final class SumOfNNumbers {
    /** final.
*
*/
    private Solution() {
        //private function
    }
    /**{ function_description }.
     *
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
