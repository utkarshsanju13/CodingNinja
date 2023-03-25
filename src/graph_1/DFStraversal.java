package graph_1;

public class DFStraversal {
	
	public static void main(String[] args) {
		int matrix[][] = {{0,1,1,0,1}, 
						  {1,0,0,1,0},
						  {1,0,0,1,1},
						  {0,1,1,0,1},
						  {1,0,1,1,0}};
		boolean[] visited = new boolean[matrix.length];
		
		dfsTraversal(matrix,0,visited);
		
		}
	
	public static void dfsTraversal(int [][] matrix, int currentVertex, boolean[] visited) {
		
		System.out.print(currentVertex+ " ");
		visited[currentVertex] = true;
		for(int i = 0; i < matrix.length; i++) {
			
			if(matrix[currentVertex][i] == 1 && visited[i] == false) {
				
				dfsTraversal(matrix, i, visited);
			}
		}
	}
}
