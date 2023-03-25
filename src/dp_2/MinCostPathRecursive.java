package dp_2;

public class MinCostPathRecursive {
	
	public static int minCostPath(int cost[][], int i, int j) {
		int m = cost.length;
		int n = cost[0].length;
		
		if(i == m-1 && j == n-1)
			return cost[i][j];
		
		//Base case
		if(i >= m || j >= n)
			return Integer.MAX_VALUE;
		
		int ans1 = minCostPath(cost, i+1, j);
		int ans2 = minCostPath(cost, i, j+1);
		int ans3 = minCostPath(cost, i+1, j+1);
		
		int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
		
		return myAns;
	}
	
	public static void main(String[] args) {
		
		int cost[][] = {{1,5,11}, {8,13,12}, {2,3,7},{15,16,18}};
		System.out.println(minCostPath(cost, 0, 0));
	}

}
