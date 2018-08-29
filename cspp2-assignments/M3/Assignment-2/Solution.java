
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        int i = 0;
        for (i=7; i < n ;i += 10 ) {
        	count = count +1;
        } 
        System.out.println(count);  
    }
}
