package basicProgram;

import java.util.Scanner;

//Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//F(n) = F(n-1) + F(n-2), 
//Where, F(1) = F(2) = 1
//Provided N you have to find out the Nth Fibonacci Number.
public class nthFibonacciNumber {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 1;
        int b = 1;
        int c = 0;
        int i = 3;
        while(i <= n){
            
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        
        if(n == 1 || n == 2){
            System.out.println(a);
        }else{
            System.out.println(c);

        }

        
		
	}

}
