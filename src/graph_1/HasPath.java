package graph_1;

import java.io.IOException;
import java.util.Scanner;

public class HasPath {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */

		 Scanner sc = new Scanner(System.in);

		 int v = sc.nextInt();
		 int e = sc.nextInt();

		int matrix[][] = new int [v][v];
		 for(int i = 0; i < e; i++){
			 int v1 = sc.nextInt();
			 int v2 = sc.nextInt();

			 matrix[v1][v2] = 1;
			 matrix[v2][v1] = 1;
		 }

		 int s = sc.nextInt();
		 int d = sc.nextInt();

		boolean visited[] = new boolean[v];

		 System.out.println(checkPathPresent(matrix, s, d,visited));

	}

	public static boolean checkPathPresent(int [][] matrix, int s, int d,boolean visited[]){

		if(s == d)
			return true;

			visited[s] = true;

		for(int i = 0; i < matrix.length; i++){
			
			if(matrix[s][i] == 1 && visited[i] == false){
					if(checkPathPresent(matrix, i, d, visited))
						return true;
			}
		}
		return false;	
	}

}
