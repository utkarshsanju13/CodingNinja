package dp_1;

public class MinStepToOneDPIterative {

	public static int countMinStepsToOne(int n) {
	

		int dp[] = new int[n+1];
//		dp[0] = 0;
		dp[1] = 0;

		for(int i = 2; i < dp.length; i++){
			
			int min = dp[i-1];
			
			if(i % 2 == 0){
				min =Math.min(min, dp[i/2]);
			}
			
			if(i % 3 == 0){
				min = Math.min(min, dp[i/3]);
			}

			dp[i] = min +1;
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		
		int i = 275;
		System.out.println(countMinStepsToOne(i));
	}
}
