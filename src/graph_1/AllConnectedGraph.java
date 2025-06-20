package graph_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Given an undirected graph G(V,E), find and print all the connected components of the given graph G.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. You need to take input in main and create a function which should return all the connected components. And then print them in the main, not inside function.
Print different components in new line. And each component should be printed in increasing order (separated by space). Order of different components doesn't matter.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two space separated integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print different components in new line. And each component should be printed in increasing order of vertices (separated by space). Order of different components doesn't matter.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Sample Input 1:
4 2
0 1
2 3
Sample Output 1:
0 1 
2 3 
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
0 1 3 
2*/

public class AllConnectedGraph {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		int matrix[][] = new int[v][v];
		for(int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
		
		print(matrix);
		
	}
	
	private static void print(int[][] matrix) {
		boolean visited[] = new boolean[matrix.length];
		for(int i = 0 ; i < visited.length; i++) {
			if(!visited[i]) {
				ArrayList<Integer> ans = new ArrayList<>();
				dfsTraversal(matrix,i,visited,ans);
				Collections.sort(ans);
				
				for(int j = 0 ; j < ans.size(); j++) {
					System.out.print(ans.get(j) + " ");
				}
				System.out.println();
			}
		}
	}

	private static void dfsTraversal(int[][] matrix, int s, boolean[] visited, ArrayList<Integer> arrAns) {
		// TODO Auto-generated method stub
		visited[s] = true;
		arrAns.add(s);
		
		int n = matrix.length;
		for(int i = 0 ; i< n;i++) {
			if(matrix[s][i] == 1 && visited[i] == false) {
				dfsTraversal(matrix, i, visited, arrAns);
			}
		}
		
	}

}
