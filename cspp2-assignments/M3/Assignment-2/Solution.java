
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
        int i;
        for (i=1; i < n ;i += 1 ) {
        	if (i % 10 == 7 && i/10 == 7) {
        		count = count + 1 ;
        	}

        } 
        System.out.println(count);  
    }
}
