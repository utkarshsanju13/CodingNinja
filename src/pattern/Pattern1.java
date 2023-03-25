package pattern;

import java.util.Scanner;

public class Pattern1 {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
        int n = 5;
        
        int i = 1, j = 1;
        while(i <= n){
            
            while(j <= n){
                
                System.out.print(n);
                j++;
            }
            
            System.out.println();
			i++;
        }
    }
}

