package basicProgram;

import java.util.Scanner;

//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//Input format :
//Integer x
//Output format :
//Terms of series (separated by space)

public class termsOfAP {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfTerms = 1;
        int i = 1;
        while(noOfTerms<=n){
            
            int term = 3*i + 2;
            i++;
            if(term%4 == 0){
                continue;
       		 }
        
        	System.out.print(term+" ");
			noOfTerms++;
        }
	}
}
