package dp_1;

/*A thief wants to loot houses. He knows the amount of 
money in each house. He cannot loot two consecutive houses. Find the maximum amount of money 
he can loot.
Input format :
The first line of input contains an integer value of 'n'. It is the total number of houses.

The second line of input contains 'n' integer values separated by a single space denoting the 
amount of money each house has.*/

public class LootHouse {

	public static int maxMoneyLooted(int[] houses) {
		// Your code goes here
		int n = houses.length;
		if (n == 0)
			return 0;

		if (n == 1)
			return houses[0];
		if (n == 2)
			return Math.max(houses[0], houses[1]);

		int dp[] = new int[houses.length];

		dp[0] = houses[0];
		dp[1] = Math.max(houses[0], houses[1]);
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 1], houses[i] + dp[i - 2]);
		}

		return dp[n - 1];
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10, 2, 30, 20, 3, 50};
		System.out.println(maxMoneyLooted(arr));
	}

}
