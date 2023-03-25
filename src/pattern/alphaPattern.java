package pattern;

import java.util.Scanner;

public class alphaPattern {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 1;
	        char ch = 'A';
	        while(i<=n){
	            int j = 1;
	            char r = (char)(ch + i - 1);
	            while(j <= i){
	                System.out.print(r);
	                j++;
	            }
	            System.out.println();
				i++;
	        }

		}
	}
