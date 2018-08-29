/**
*
*/
public final class ConverttoWhileLoop {
    /**
*
*/
    private static final int TEN = 10;
    /**
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
        final int i = 2;
        while (i <= TEN) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("GoodBye!");
    }
}
