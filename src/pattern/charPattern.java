package pattern;

import java.util.Scanner;
//A
//BC
//CDE
//DEFG

public class charPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(i <= n){
            int j = 1;
			char p = (char)('A' + i - 1);
            while(j <= i){
                System.out.print(p);
                p = (char)(p + 1);
                j++;
            }
            System.out.println();
			i++;
        }

		
	}

	}
