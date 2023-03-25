package dp_assignment;

public class WaysToMakeCoinChangeDpIterative {
	
	public static int countWaysToMakeChange(int a[], int n, int value) {
		
		int dp[][] = new int[n][value+1];
		
		for(int i = 0 ; i <=value; i++) {
			dp[0][i] = i % a[0] == 0 ? 1: 0;
		}
											
		for(int i = 1; i <n; i++) {
			
			for(int j = 0; j <= value; j++) {
				
				int notTake = dp[i-1][j];
				int take = 0;
				if(a[i] <= j) {
					take = dp[i][j-a[i]];
				}	
				dp[i][j] = notTake + take;
			}	
		}
	
		return dp[n-1][value];	
	}

	public static void main(String[] args) {
			
		int denominations[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int val = 301;
		System.out.println(countWaysToMakeChange(denominations, denominations.length, val));
		
	}
}
