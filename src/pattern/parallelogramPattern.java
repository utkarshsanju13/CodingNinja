package pattern;

import java.util.Scanner;

//*****
// *****
//  *****
//   *****
//    *****

public class parallelogramPattern {
	public static void main(String[] args) {
		
		// Write your code here
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            
            int spaces = i;
            while(spaces > 1){
                System.out.print(" ");
                spaces--;
            }
            
            int j = 1;
            while(j <= n){
                System.out.print("*");
                j++;
            }
            
             i++;
            System.out.println();
        }
	}
}
