package graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsConnected {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		int [][] matrix = new int[v][v];
		for(int i = 0 ; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
		
		boolean isConnected = checkIsConnected(matrix,0);
		System.out.println(isConnected);
	}

	private static boolean checkIsConnected(int[][] matrix, int s) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		boolean visited[] = new boolean[matrix.length];
		visited[s] = true;
		q.add(s);
		
		while(!q.isEmpty()) {
			int currentVertex = q.poll();
			for(int i = 0 ; i < matrix.length; i++) {
				if(matrix[currentVertex][i] == 1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		
		for(Boolean b: visited) {
			if(!b) {
				return false;
			}
		}
		
		return true;
	}

}
