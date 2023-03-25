package pattern;

import java.util.Scanner;

public class DiamondOfStar {
	 public static void main(String[] args) {
	        // Write your code here
	        
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        
	        int n1 = n/2 +1;
	        int n2 = n/2;
	        
	        int i = 1;
	        while(i <= n1){
	            
	            int spaces = 1;
	            while(spaces <= n1 - i){
	                System.out.print(" ");
	                spaces++;
	            }
	            
	            int star = 1;
	            while(star <= 2*i - 1){
	                System.out.print("*");
					star++;
	            }
	            
	            i++;
	            System.out.println();
	        }
	        
	        
	        int j = n2;
	        while(j > 0){
	            
	            int spaces = 1;
	            while(spaces <= n2 - j + 1){
	                System.out.print(" ");
					spaces++;
	            }
	            
	            int star = 1;
	            while(star <= 2*j -1){
	                System.out.print("*");
						star++;
	            }
	            
	            j--;
	            System.out.println();

	        }
	    }
	}

