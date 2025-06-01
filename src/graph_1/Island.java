package graph_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Islands
Send Feedback
An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach from any given island to any other island in the same group . Given V islands (numbered from 0 to V-1) and E connections or edges between islands. Can you count the number of connected groups of islands.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b. 
Output Format :
Print the count the number of connected groups of islands
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V-1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
5 8
0 1
0 4
1 2
2 0
2 4
3 0
3 2
4 3
Sample Output 1:
1 */

public class Island {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		 int [][]edges = takeInput();
	        
	        int ans = Island.numConnected(edges, edges.length);
	        System.out.println(ans);
	}
	  
	    
	    public static int[][] takeInput() throws IOException {
			String[] strNums;
	        strNums = br.readLine().split("\\s");
	        int n = Integer.parseInt(strNums[0]);
	        int e = Integer.parseInt(strNums[1]);

	        int[][] edges = new int[n][n];
	        int firstvertex, secondvertex;

	        for (int i = 0; i < e; i++) {
	            String[] strNums1;
	            strNums1 = br.readLine().split("\\s");
	            firstvertex = Integer.parseInt(strNums1[0]);
	            secondvertex = Integer.parseInt(strNums1[1]);
	            edges[firstvertex][secondvertex] = 1;
	            edges[secondvertex][firstvertex] = 1;
	        }
	        return edges;
	    }
	
	public static void helpDFS(int edges[][], boolean visited[], int start, int n) {
		// mark visited as true
		visited[start] = true;
		// go through all the adjacent vertices of start vertex which have value 1 in
		// the adjacency matrix
		for (int j = 0; j < n; j++) {
			if (edges[start][j] == 1 && !visited[j]) {
				helpDFS(edges, visited, j, n);
			}
		}
	}

	public static int numConnected(int[][] edges, int n) {

		boolean[] visited = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			// if the vertex is not visted call dfs on the vertex
			if (!visited[i]) {
				// after 1st call mark count = count+1;
				count++;
				helpDFS(edges, visited, i, n);

			}
		}
		return count; // this returns the final number of times helpDFS was called, that is number of
						// coonected components/islands

	}
	

}
