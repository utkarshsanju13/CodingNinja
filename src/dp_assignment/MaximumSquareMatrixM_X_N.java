package dp_assignment;

public class MaximumSquareMatrixM_X_N {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
        
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(input.length == 0)
			return 0;
		int m = input.length;
		int n = input[0].length;
		
		int dp[][] = new int [m][n];

		for(int i = 0 ; i < m; i++){
			if(input[i][0] == 0){
				dp[i][0] = 1;
			}else{
				dp[i][0] = 0;
			}
		}

		for(int j = 0; j < n;  j++){
			if(input[0][j] == 0){
				dp[0][j] = 1;
			}else{
				dp[0][j] = 0;
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 1 ; i < m; i++){
			 for(int j = 1; j < n; j++){
				 if(input[i][j] == 1){
					 dp[i][j] = 0;
				 }else{
					 int ans1 = dp[i-1][j-1];
					 int ans2 = dp[i-1][j];
					 int ans3 = dp[i][j-1];
					
					dp[i][j] = 1 + Math.min(ans1, Math.min(ans2, ans3));
				 }
				
				 if(dp[i][j] > max){
					 max = dp[i][j];
				 }
			 }
		}

		return max;
	}
	
	public static void main(String[] args) {
		
		int [][] input = {};
		System.out.println(findMaxSquareWithAllZeros(input));
	}
}
