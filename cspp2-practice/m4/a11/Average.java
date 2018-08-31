import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Average {
    /**
     * { item_description }.
     */
    private Average() {
    }
    /**.
 * { item_description }
     * @param args { item_description }
 */
    public static void main(final String[] args) {
        System.out.println("No. of elements in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The average of numbers is : " + sum / n);
    }
}
