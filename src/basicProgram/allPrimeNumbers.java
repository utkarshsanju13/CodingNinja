package basicProgram;

import java.util.Scanner;

//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines.
//Input Format :
//Integer N
//Output Format :
//Prime numbers in different lines

public class allPrimeNumbers {
	
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i = 2;
        while(i <= n){
            
            int j = i-1;
            boolean divisible = false;
            while(j > 1){
                
                if(i % j == 0){
                    divisible = true;
                }
                j--;
            }
            
            if(divisible == false){
                System.out.println(i);
            }
            i++;
        }

		
	}

}
