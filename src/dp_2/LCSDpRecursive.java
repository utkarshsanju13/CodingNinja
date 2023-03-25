package dp_2;

public class LCSDpRecursive {

	public static int lcsRecursive(String str1, String str2, int i, int j, int [][] dp) {

		if (i == str1.length() || j == str2.length()) {
			return 0;
		}
		int myAns;
		if (str1.charAt(i) == str2.charAt(j)) {
			int smallAns;
			if(dp[i+1][j+1] == -1) {
				smallAns = lcsRecursive(str1, str2, i + 1, j + 1,dp);
				dp[i+1][j+1] = smallAns;
			}else {
				smallAns = dp[i+1][j+1];
			}
			myAns = 1 + smallAns;
			
		} else {
			int ans1,ans2;
			
			if(dp[i+1][j] == -1) {
				ans1 = lcsRecursive(str1, str2, i + 1, j,dp);
				dp[i+1][j] = ans1;
			}else {
				ans1 = dp[i+1][j];
			}
			
			if(dp[i][j+1] == -1) {
				ans2 = lcsRecursive(str1, str2, i, j+1, dp);
				dp[i][j+1] = ans2;
			}else {
				ans2 = dp[i][j+1];
			}
			myAns = Math.max(ans1, ans2);
		}

		return myAns;
	}

	public static void main(String[] args) {

		String str1 = "bedgmc";
		String str2 = "abdfglc";
		int dp[][] = new int[str1.length() + 1][str2.length() + 1];
		
		for(int i = 0 ; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				
				dp[i][j] = -1;
			}
		}

		System.out.println(lcsRecursive(str1, str2, 0, 0,dp));
	}

}
