import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : 
 */
final class Solution {
    /**
     * { var_description }
     */
    private static final int FIFTY = 50;
    /**
     * { var_description }
     */
    private static final int ONEFIFTY = 150;
    /**
     * { var_description }
     */
    private static final int TWOFIFTY = 250;
    /**
     * { var_description }
     */
    private static final int THREEFIFTY = 350;
    /**
     * { var_description }
     */
    private static final int FOURFIFTY = 450;
    /**
     * { var_description }
     */
    private static final int FIVEFIFTY = 550;
    /**
     * { var_description }
     */
    private static final int SIXFIFTY = 650;
    /**
     * { var_description }
     */
    private static final int SEVENFIFTY = 750;
    /**
     * { var_description }
     */
    private static final int EIGHTFIFTY = 850;
    /**
     * { var_description }
     */
    private static final int NINEFIFTY = 950;
    /**
     * { var_description }
     */
    private static final int THOUSANDFIFTY = 1050;
    /**
     * { var_description }
     */
    private static final int HUNDRED = 100;
    /**
     * { var_description }
     */
    private static final int TWOHUNDRED = 200;
    /**
     * { var_description }
     */
    private static final int THREEHUNDRED = 300;
    /**
     * { var_description }
     */
    private static final int FOURHUNDRED = 400;
    /**
     * { var_description }
     */
    private static final int FIVEHUNDRED = 500;
    /**
     * { var_description }
     */
    private static final int SIXHUNDRED = 600;
    /**
     * { var_description }
     */   
    private static final int SEVENHUNDRED = 700;
    /**
     * { var_description }
     */
    private static final int EIGHTHUNDRED = 800;
    /**
     * { var_description }
     */
    private static final int NINEHUNDRED = 900;
    /**
     * { var_description }
     */
    private static final int THOUSAND = 1000;
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int rows, final int columns) {
// write your code here
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                if (a[i][j] >= 0 && a[i][j] <= FIFTY) {
                    a[i][j] = 0;
                 } else if (a[i][j] >= FIFTY && a[i][j] <= ONEFIFTY) {
                    a[i][j] = HUNDRED;
                } else if (a[i][j] >= ONEFIFTY && a[i][j] <= TWOFIFTY) {
                    a[i][j] = TWOHUNDRED;
                } else if (a[i][j] >= TWOFIFTY && a[i][j] <= THREEFIFTY) {
                    a[i][j] = THREEHUNDRED;
                } else if (a[i][j] >= THREEFIFTY && a[i][j] <= FOURFIFTY) {
                    a[i][j] = FOURHUNDRED;
                } else if (a[i][j] >= FOURFIFTY && a[i][j] <= FIVEFIFTY) {
                    a[i][j] = FIVEHUNDRED;
                } else if (a[i][j] >= FIVEFIFTY && a[i][j] <= SIXFIFTY) {
                    a[i][j] = SIXHUNDRED;
                } else if (a[i][j] >= SIXFIFTY && a[i][j] <= SEVENFIFTY) {
                    a[i][j] = SEVENHUNDRED;
                } else if (a[i][j] >= SEVENFIFTY && a[i][j] <= EIGHTFIFTY) {
                    a[i][j] = EIGHTHUNDRED;
                } else if (a[i][j] >= EIGHTFIFTY && a[i][j] <= NINEFIFTY) {
                    a[i][j] = NINEHUNDRED;
                } else if (a[i][j] >= NINEFIFTY && a[i][j] <= THOUSANDFIFTY) {
                    a[i][j] = THOUSAND;
                }
            }
        }
        return a;       
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}