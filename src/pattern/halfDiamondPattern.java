package pattern;

import java.util.Scanner;

//*
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*
//*
public class halfDiamondPattern {

	 public static void main(String[] args) {
	        // Write your code here
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        
	        int r = 2*n + 1;
	        int n1 = r/2 + 1;
	        int n2 = r/2;
	        System.out.println("*");
	        int i = 1;
	        
	        while(i <= n1 - 1){
	            
	            System.out.print("*");
	            int inc = 1;
	            while(inc <= i){
	                System.out.print(inc);
	                inc++;
	            }
	            
	            int dec = i - 1;
	            while(dec > 0){
	                System.out.print(dec);
	                dec--;
	            }
	            System.out.print("*");
	            i++;
	            System.out.println();
	        }
	        
	        int j = n2 - 1;
	        while(j > 0){
	        
	            System.out.print("*");
	             int inc = 1;
	            while(inc <= j){
	                System.out.print(inc);
					inc++;
	            }
		
	            int dec = j - 1;
	            while(dec > 0){
	                System.out.print(dec);
	                dec--;
	            }
	            System.out.print("*");
	            j--;
	            System.out.println();
	        }
	        System.out.println("*");

	    }
}
