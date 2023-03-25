package pattern;

import java.util.Scanner;

//input = 5
//13579
//35791
//57913
//79135
//91357

public class oddSquare {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int i = 1;
        
        while(i <= n){
            
            int j = i;
            int times = 0;
            while(j <= n){
                times++;
                System.out.print(2*j - 1);
                j++;
            }
            // System.out.println(times);
            
            int k = 0;
            while(k >= 0 && k <= i - 1){
                if(2*k - 1 > 0)
                 System.out.print(2*k - 1);
                k++;
            }
            
            i++;
            System.out.println();

        }
	}
}
