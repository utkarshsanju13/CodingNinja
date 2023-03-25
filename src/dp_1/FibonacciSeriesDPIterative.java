package dp_1;

public class FibonacciSeriesDPIterative {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(fibI(n));
	}

	private static int fibI(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}
