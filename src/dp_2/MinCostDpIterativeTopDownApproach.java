package dp_2;

public class MinCostDpIterativeTopDownApproach {
	
	public static int MinCostDpIterative(int cost[][]) {
		int m = cost.length;
		int n = cost[0].length;
		
		int dp[][] = new int[m+1][n+1];
		
		for(int i = 0 ; i < dp.length; i++) {
			
			for(int j = 0 ; j < dp[0].length; j++) {
				
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				
				if(i == 1 && j == 1) {
					dp[i][j] = cost[0][0];
					continue;
				}
				
				int ans1 = dp[i-1][j];
				int ans2 = dp[i][j-1];
				int ans3 = dp[i-1][j-1];
				
				dp[i][j] = cost[i-1][j-1] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		
		return dp[m][n];
	}
	
	public static void main(String[] args) {

		int cost[][] = { { 1, 5, 11 }, { 8, 13, 12 }, { 2, 3, 7 }, { 15, 16, 18 } };
		System.out.println(MinCostDpIterative(cost));
	}


}
