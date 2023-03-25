package basicProgram;

import java.util.Scanner;

//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
//
//
//Input format :
//Integer N
//Output format :
//Corresponding reverse number

public class revrseOfNumber {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int totalDigit = 0;
        int num = n;
        while(num > 0){
            totalDigit++;
            num = num/10;
        }
		
        long result = 0;
        while(n > 0){
            
            int digit = n%10;
            result = (long)(result + (digit) * (Math.pow(10, --totalDigit)));
            n/=10;
        }
        
        System.out.print(result);


	}
}
