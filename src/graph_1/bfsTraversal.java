package graph_1;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*BFS
Send Feedback
Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
1. Here you need to consider that you need to print BFS path starting from vertex 0 only. 
2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
3. E is the number of edges present in graph G.
4. Take graph input in the adjacency matrix.
5. Handle for Disconnected Graphs as well
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print the BFS Traversal, as described in the task.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3*/

public class bfsTraversal {

public static void main(String[] args) throws NumberFormatException, IOException {
		
        Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		int [][] matrix = new int[v][v];
		for(int i = 0 ; i < e; i++){
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				matrix[v1][v2] = 1;
				matrix[v2][v1] = 1;
		}

		if( v == 0){
			System.out.println();
		}else if(e==0){
			for(int i = 0 ; i < v; i++){
				System.out.print(i+" ");
			}
		}else
			print(matrix);
	}

	public static void print(int matrix[][]) {
		boolean visited[] = new boolean[matrix.length]; 
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i]) {
				bfsTraversal(matrix, i, visited);
			}
		}
	}


	public static void bfsTraversal(int [][]matrix, int currentIndex, boolean [] visited){

			Queue<Integer> q = new LinkedList<>();
			q.add(currentIndex);
			visited[currentIndex] = true;

			while(!q.isEmpty()){
				int currentVertex = q.poll(); 
				System.out.print(currentVertex+ " ");

				for(int i = 0; i < matrix.length; i++){

					if(matrix[currentVertex][i] == 1 && visited[i] == false){
						q.add(i);
						visited[i] = true;
					}
				}
			}

	}

}