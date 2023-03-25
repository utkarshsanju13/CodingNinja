package dp_assignment;

public class GetMinimumStrength {
	
	 public static int getMinimumStrength(int[][] grid) {
	        
	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
	        int m = grid.length;
	        int n = grid[0].length;

	        int dp[][] = new int[m][n];

	        dp[m-1][n-1] = grid[m-1][n-1] > 0 ? 1: Math.abs(grid[m-1][n-1]) + 1;

	    

	        for(int i = m-2; i >= 0; i--){
	            dp[i][n-1] = Math.max(dp[i+1][n-1] - grid[i][n-1], 1);
	        }

	        for(int j = n-2; j>=0; j--){
	            dp[m-1][j] = Math.max(dp[m-1][j+1] - grid[m-1][j], 1);
	        }

	        for(int i = m-2; i>=0; i--){
	            for(int j = n-2; j>=0; j--){
	                int min_point_exit = Math.min(dp[i+1][j], dp[i][j+1]);
	                dp[i][j] = Math.max(min_point_exit - grid[i][j], 1);
	            }
	        }

	        return dp[0][0];


	    }
	 
	 public static void main(String[] args) {
		
		 int arr[][] = {
		 {0, -2, -3, 1},
		 {-1, 4, 0, -2},
		 {1, -2,-3, 0}};
		 
		 System.out.println(getMinimumStrength(arr));
				 
		 
	}

}
