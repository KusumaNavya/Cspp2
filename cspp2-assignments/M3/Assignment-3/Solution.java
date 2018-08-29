
import java.util.Scanner;
/**
    Do not modify this main function.
    */
public final class Solution {
    /**
*
*/
    private Solution() {

        //private function
    }
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println(gcd);
    }
    /**
    Need to write the gcd function and print the output.  
    @param      n1    The n 1
    @param      n2    The n 2
    @return     { description_of_the_return_value }
    */
    public static int gcd(final int n1,final int n2) {
        int min = 0;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        for(int i = min; i > 1 ; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
