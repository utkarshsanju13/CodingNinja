package dp_2;

public class MinCostPathDpRecursive {
	
	public static int minCostPath(int cost[][],int dp[][], int i, int j) {
		int m = cost.length;
		int n = cost[0].length;
		
		if(i == m-1 && j == n-1)
			return cost[i][j];
		
		//Base case
		if(i >= m || j >= n)
			return Integer.MAX_VALUE;
		
		int ans1,ans2,ans3;
		if(dp[i+1][j] == -1) {
			ans1 = minCostPath(cost,dp, i+1, j);
			dp[i+1][j] = ans1;
		}else {
			ans1 = dp[i+1][j];
		}
		
		if(dp[i][j+1] == -1) {
			ans2 = minCostPath(cost,dp, i, j+1);
			dp[i][j+1] = ans2;
		}else {
			ans2 = dp[i][j+1];
		}
		
		if(dp[i+1][j+1] == -1) {
			ans3 = minCostPath(cost,dp, i+1, j+1);
			dp[i+1][j+1] = ans3;
		}else {
			ans3 = dp[i+1][j+1];
		}
		
		
		int myAns;
		if(dp[i][j] == -1) {
			myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			dp[i][j] = myAns;
		}else {
			myAns = dp[i][j];
		}
		
		return myAns;
	}
	
	public static void main(String[] args) {
		
		int cost[][] = {{1,5,11}, {8,13,12}, {2,3,7},{15,16,18}};
		int dp[][] = new int[cost.length +1][cost[0].length +1];
		for(int i = 0 ; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(minCostPath(cost,dp, 0, 0));
		for(int i = 0 ; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				System.out.print(dp[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
