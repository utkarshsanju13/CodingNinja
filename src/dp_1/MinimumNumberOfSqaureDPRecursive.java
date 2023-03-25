package dp_1;

//Time complexity = n rootn
public class MinimumNumberOfSqaureDPRecursive {
	
	public static int minimumNumberOfSquareRecursive(int n, int [] dp) {
		
		if(n == 0)
			return 0;
		
		int minAns = Integer.MAX_VALUE;
		for(int i = 1 ; i*i <= n; i++) {
			int currAns;
			if(dp[n-(i*i)] == -1) {
				currAns = minimumNumberOfSquareRecursive(n-(i*i),dp);
				dp[n-(i*i)] = currAns;
			}else {
				currAns = dp[n-(i*i)];
			}
			if(minAns > currAns) {
				minAns = currAns;
			}
		}
		
		int myAns = 1 + minAns;
		
		return myAns;
				
	}
	
	public static void main(String[] args) {
		int n = 7;
		int dp[] = new int[n+1];
		for(int i = 0 ; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(minimumNumberOfSquareRecursive(n,dp));
		for(int i = 0 ; i < dp.length; i++) {
			System.out.print(dp[i]+ " ");
		}
	}
}
