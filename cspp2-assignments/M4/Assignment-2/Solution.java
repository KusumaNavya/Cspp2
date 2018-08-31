import java.util.Scanner;
/**. Solution the class
*/
final class Solution {
    /**. Fill the main function to print resultant of addition of matrices*/
    private Solution() {
        /**.
        @constructor
        */
    }
    /**.
    @param args the arguments
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        int nc1 = sc.nextInt();
        int[][] a = new int[nr1][nc1];
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int nr2 = sc.nextInt();
        int nc2 = sc.nextInt();
        int[][] b = new int[nr2][nc2];
        for (int i = 0; i < nr2; i++) {
            for (int j = 0; j < nc2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] array = new int[nr1][nc1];
    if (nr1 == nr2 && nc1 == nc2) {
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                array[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                if (j == nc1 - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
        System.out.println();
        }

} else {
        System.out.println("not possible");
    }
    }
}