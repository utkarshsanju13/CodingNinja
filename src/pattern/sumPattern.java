package pattern;

import java.util.Scanner;

//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10
//1+2+3+4+5=15

public class sumPattern {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        
        while(i <= n){
            int sum = 0;
            
            int j = 1;
            while(j <= i - 1){
                sum = sum + j;
                System.out.print(j+""+"+");
                j++;
            }
            
            System.out.print(j+""+"=");
            sum = sum + j;
            System.out.println(sum);
            i++;

        }
	}
}

