package dp_2;

public class MinCostDpIterative {

	public static int minCostPath(int[][] input) {
		// Your code goes here
		int m = input.length;
		int n = input[0].length;

		int dp[][] = new int[input.length + 1][input[0].length + 1];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = m - 1; i >= 0; i--) {

			for (int j = n - 1; j >= 0; j--) {

				if (i == m - 1 && j == n - 1) {
					dp[i][j] = input[i][j];
					continue;
				}

				dp[i][j] = input[i][j] + Math.min(dp[i + 1][j], Math.min(dp[i][j + 1], dp[i + 1][j + 1]));

			}
		}

		return dp[0][0];

	}

	public static void main(String[] args) {

		int cost[][] = { { 1, 5, 11 }, { 8, 13, 12 }, { 2, 3, 7 }, { 15, 16, 18 } };
		System.out.println(minCostPath(cost));
	}

}
