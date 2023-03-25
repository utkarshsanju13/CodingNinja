package pattern;

import java.util.Scanner;

public class Pattern2 {
	
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner sc = new Scanner(System.in);
        int n = 5;
        
        int i = 1;
        while(i <= n){
             
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(" ");
                spaces++;
            }
            
            int number = 1;
            while(number <= i){
                System.out.print(number);
                number++;
            }
            i++;
            System.out.println();
        }
        
       
	}


}
