package basicProgram;

import java.util.Scanner;

//Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
//If C is equal to -
// 1, then print the sum
// 2, then print the product
// Any other number, then print '-1' (without the quotes)
//Input format :
//Line 1 : Integer N
//Line 2 : Choice C


public class sumOrProduct {

	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int choice = sc.nextInt();
        int i = 1;
        int sum = 0;
        int product = 1;
        switch(choice){
                
            case 1:
                    while(i<=n){
                        sum = sum + i;
                        i++;
                    }
                    System.out.println(sum);
                    break;
                
                
            case 2:   
                    while(i<=n){
                        product = product * i;
                        i++;
                    }
                    System.out.println(product);
                    break;
                
            default:
				System.out.println("-1");
                
                
                
        }

	}
}
