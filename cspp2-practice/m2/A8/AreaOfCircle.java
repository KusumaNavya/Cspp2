/**
*
**/
import java.util.Scanner;
/**function.
 *area of circle
**/
public final class AreaOfCircle {
   /**
    *
    **/
   private AreaOfCircle() {
}
/**
 *main functio.
  *@param args is the parameter for the statement.
**/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius r :");
        double r = sc.nextDouble();
        double area = area(r);
        System.out.println("Area of circle is: " + area);
    }
/**
*@param r is the parameter for the statement.
*@return double
**/
public static double area(final double r) {

        double area = (pi() * r * r);
        return (area);
         }
/**
*@return double
**/
public static double pi() {
    double pi = 22 / 7;
    return (pi);
}
}
