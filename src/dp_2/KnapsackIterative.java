package dp_2;

public class KnapsackIterative {
	
public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		
		int dp[][] = new int [n+1][maxWeight + 1];

		for(int i = n-1; i >= 0; i--){
			int ans;
			for(int j = 0 ; j <= maxWeight; j++){

				if(weights[i] <= j){
					int ans1 = values[i] + dp[i+1][j-weights[i]];
					int ans2 = dp[i+1][j];
					ans = Math.max(ans1, ans2);
				}else{
					ans = dp[i+1][j];
				}
				dp[i][j] = ans;
			}
		}

		return dp[0][maxWeight];

		
	}

	public static void main(String[] args) {
		
		int val[] = {20, 30, 10};
		int w[] = {2,3,4};
		
		int W = 5;
		
		System.out.println(knapsack(w, val, 3, W));
	}

}
