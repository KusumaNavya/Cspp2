/**
*
*/
public final class Pattern {
    /**
*
*/
    private static final int FIVE = 5;
    /** final.
*
*/
    private Solution() {
        //private function.
    }
    /**{ function_description }.
     *
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int i = 0;
        //String temp = " ";
        for (i = 1; i <= FIVE; i++) {
            // temp = temp + i + " ";
            // System.out.println(temp);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
