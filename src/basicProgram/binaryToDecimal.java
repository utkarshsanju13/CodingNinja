package basicProgram;

import java.util.Scanner;

//Given a binary number as an integer N, convert it into decimal and print.
//Input format :
//An integer N in the Binary Format
//Output format :
//Corresponding Decimal number (as integer)
public class binaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
	        
	        Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        int totalDigit = 0;
	        long num = n;
	        
	        while(num > 0){
	            totalDigit++;
	            num/=10;
	        }
	        long result = 0;
	        int j = 0;
	        while(j <= totalDigit - 1){
	            
	            long digit = n % 10;
	            result += (long)(digit * Math.pow(2,j));
	            j++;
	            n/=10;
	            
	        }

	        System.out.println(result);

		}
	    

}
