package graph_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using DFS and print the first path that you encountered.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
Print the path from v1 to v2 in reverse order.
Constraints :
2 <= V <= 1000
1 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3*/

public class GetPathDFS {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Write Your Code Here Complete the Rest of the Program You have to take input
		 * and print the output yourself
		 */

		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		int[][] matrix = new int[v][v];
		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}

		int s = sc.nextInt();
		int d = sc.nextInt();
		boolean visited[] = new boolean[v];
		ArrayList<Integer> result = getPathDFS(matrix, s, d, visited);

		if (result != null) {
			for (int i : result) {
				System.out.print(i + " ");
			}
		}

	}

	public static ArrayList<Integer> getPathDFS(int[][] matrix, int s, int d, boolean[] visited) {

		if (s == d) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(s);
			visited[s] = true;

			return ans;
		}

		visited[s] = true;

		for (int i = 0; i < matrix.length; i++) {

			if (matrix[s][i] == 1 && !visited[i]) {

				ArrayList<Integer> tempAns = getPathDFS(matrix, i, d, visited);

				if (tempAns != null) {
					tempAns.add(s);

					return tempAns;
				}
			}
		}

		return null;
	}

}
