import java.util.Scanner;
 /**
*
    */
public final class BiggerSmallerEqual {
    /**
    *
    **/
   private BiggerSmallerEqual() {
}
    /**
    @param args Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int varA = scan.nextInt();
        int varB = scan.nextInt();
        if (varA > varB) {
            System.out.println("Bigger");
        } else if (varA == varB) {
            System.out.println("Equal");
        } else {
            System.out.println("Smaller ");
        }
    }
}
