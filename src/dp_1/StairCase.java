package dp_1;


/*A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time.
Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of
steps.
Output format :
Print the total possible number of ways.*/

public class StairCase {

	public static long staircase(int n) {
		//Your code goes here
		if(n == 0 || n == 1){
			return 1L;
		}

		if(n == 2){
			return 2L;
		}

		
		Long[] dp = new Long[n+1];

		dp[0] = 1L;
		dp[1] = 1L;
		dp[2] = 2L;

		for(int i = 3 ; i < dp.length; i++){
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		return dp[n];		
	}
	
	public static void main(String[] args) {
		
		int input = 10;
		System.out.println(staircase(input));
	}
	
}
