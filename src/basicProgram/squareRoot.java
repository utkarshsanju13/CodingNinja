package basicProgram;

import java.util.Scanner;

//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//For eg. if number given is 18, answer is 4.
//Input format :
//Integer N
//Output Format :
//Square root of N (integer part only)
public class squareRoot {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        int i = 0;
        int result = 1;
        while(i <= n){
            
            if(i*i <= n){
                result = i;
            }else{
                break;
            }
            
            i++;
        }
	
        System.out.println(result);

	}
}
