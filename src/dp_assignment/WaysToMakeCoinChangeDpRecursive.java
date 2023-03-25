package dp_assignment;

public class WaysToMakeCoinChangeDpRecursive {
	
	public static int countWaysToMakeChange(int denominations[], int value) {
		int n = denominations.length;
		int dp[][] = new int[n][value + 1];
		for(int i = 0 ; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		return countWaysToMakeChangeHelp(denominations.length - 1, denominations, value,dp);
	}

	public static int countWaysToMakeChangeHelp(int ind, int a[], int T, int[][]dp) {

		if (ind == 0) {
			if (T % a[ind] == 0)
				return 1;
			else
				return 0;
		}

		if(dp[ind][T] != -1)
			return dp[ind][T];
		int notTake = countWaysToMakeChangeHelp(ind - 1, a, T, dp);
		int take = 0;
		if (a[ind] <= T)
			take = countWaysToMakeChangeHelp(ind, a, T-a[ind], dp);

		return dp[ind][T] = notTake + take;

	}
	
	public static void main(String[] args) {
		
		
		int denominations[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int val = 301;
		System.out.println(countWaysToMakeChange(denominations, val));
		
	}


}
