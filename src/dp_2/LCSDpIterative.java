package dp_2;

public class LCSDpIterative {

	public static int lcsIterative(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int dp[][] = new int [str1.length() + 1][str2.length() + 1];
//		for(int i = 0 ; i < dp.length; i++) {
//			for(int j = 0 ; j < dp[0].length; j++) {
//				dp[i][j] = 0;
//			}
//		}
		
		for(int i = m-1; i >=0 ; i--) {
			for(int j = n-1; j >= 0; j--) {
				
				if(str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = 1 + dp[i+1][j+1];
				}else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
		
		return dp[0][0];
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "bedgmc";
		String str2 = "abdfglc";
		
		System.out.println(lcsIterative(str1, str2));
	}

}
