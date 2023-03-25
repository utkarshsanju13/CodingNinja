package dp_1;

public class MinimumNumberOfSqaureDPIterative {

	public static int minCount(int n) {

		int dp[] = new int[n + 1];
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				int currAns = dp[i - (j * j)];
				if (min > currAns) {
					min = currAns;
				}
			}

			dp[i] = 1 + min;
		}

		return dp[n];

	}
	
	public static void main(String[] args) {
		
		int n = 128;
		System.out.println(minCount(n));
	}

}
