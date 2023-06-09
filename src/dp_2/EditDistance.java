package dp_2;

/*You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' 
between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string 
equal to the other. In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note :
Strings don't contain spaces in between.
 Input format :
The first line of input contains the string S of length M.

The second line of the input contains the String T of length N.
Output format :
Print the minimum 'Edit Distance' between the strings.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 Explanation to the Sample Input 1 :
 In 2 operations we can make string T to look like string S.
First, insert character 'a' to string T, which makes it "adc".

And secondly, replace the character 'd' of string T with 'b' from the string S. This would make string T as "abc" which is also string S. 

Hence, the minimum distance.*/

public class EditDistance {
	
	public static int editDistance(String str1, String str2) {
		//Your code goes here
		int m = str1.length();
		int n = str2.length();
		int dp[][] = new int [m + 1][n + 1];
		
		for(int i = 0 ; i <=m; i++) {
			for(int j = 0 ; j<=n; j++) {
				
				if(i==0) {
					dp[i][j] = j;
				}else if(j == 0)
					dp[i][j] = i;
				else if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					int ans1 = dp[i-1][j-1];
					int ans2 = dp[i-1][j];
					int ans3 = dp[i][j-1];
					dp[i][j] = 1 + Math.min(ans1, Math.min(ans2, ans3));
				}
			}
		}
		return dp[m][n];
    }
	
	public static void printDP(int dp[][]) {
		
		for(int i = 0 ; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String str1 = "abcdc";
		String str2 = "dcd";
		
//		whgtdwhgtdg
//		aswcfg
		
		System.out.println(editDistance(str1, str2));
	}

}
