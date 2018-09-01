import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : 
 */
final class Solution {
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
        for (int i = 0; i <= rows-1; i++) {
            for (int j = 0; j <= columns-1; j++) {
                if (a[i][j] >= 0 && a[i][j] <= 50) {
                    a[i][j] = 0;
                 } else if (a[i][j] >= 50 && a[i][j] <= 150) {
                    a[i][j] = 100;
                } else if (a[i][j] >= 150 && a[i][j] <= 250) {
                    a[i][j] = 200;
                } else if (a[i][j] >= 250 && a[i][j] <= 350) {
                    a[i][j] = 300;
                } else if (a[i][j] >= 350 && a[i][j] <= 450) {
                    a[i][j] = 400;
                } else if (a[i][j] >= 450 && a[i][j] <= 550) {
                    a[i][j] = 500;
                } else if (a[i][j] >= 550 && a[i][j] <= 650) {
                    a[i][j] = 600;
                } else if (a[i][j] >= 650 && a[i][j] <= 750) {
                    a[i][j] = 700;
                } else if (a[i][j] >= 750 && a[i][j] <= 850) {
                    a[i][j] = 800;
                } else if (a[i][j] >= 850 && a[i][j] <= 950) {
                    a[i][j] = 900;
                } else if (a[i][j] >= 950 && a[i][j] <= 1050) {
                    a[i][j] = 1000;
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