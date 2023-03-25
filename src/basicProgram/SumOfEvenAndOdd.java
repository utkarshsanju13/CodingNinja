package basicProgram;

import java.util.Scanner;

public class SumOfEvenAndOdd {
		
		public static void main(String[] args) {
			// Write your code here
	        
	        Scanner sc = new Scanner(System.in);
	        
	        long num = sc.nextLong();
	        
	        
	        long even = 0;
	        long odd = 0;
	        
	        boolean flag = false;
	        
	        while(num > 0){	
	            
	            long digit = num % 10;
	            
	        
	            if(flag == false){
	                even = even + digit;
	            }else {
	                odd = odd + digit;
	            }
	            flag = !flag;
	            num = num / 10;
	            
	        }
	        
	        System.out.println(even + " "+ odd);

		}
	}



