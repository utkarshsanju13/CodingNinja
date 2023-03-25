package pattern;

import java.util.Scanner;

public class OddSqaure {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        
        while(i <= n){
            
            int j = i;
            while(j <= n - i + 1){
                System.out.print(2*j - 1);
                j++;
            }
            
//            int k = 0;
//            while(k > 0 && k <= i - 1){
//                System.out.print(2*k - 1);
//                k++;
//            }
            
            i++;
            System.out.println();

        }
	}
}


