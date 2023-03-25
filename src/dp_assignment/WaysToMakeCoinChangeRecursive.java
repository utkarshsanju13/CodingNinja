package dp_assignment;

/*For the given infinite supply of coins of each of denominations, D = {D0, D1, D2, D3, ...... Dn-1}.
You need to figure out the total number of ways W, in which you can make the change for Value V 
using coins of denominations D.
Return 0 if the change isn't possible.
Input Format
The first line of the input contains an integer value N, which denotes the total number of 
denominations.

The second line of input contains N values, separated by a single space. These values denote
the value of denomination.

The third line of the input contains an integer value, that denotes the value of V.*/

public class WaysToMakeCoinChangeRecursive {

	public static int countWaysToMakeChange(int denominations[], int value) {

		return countWaysToMakeChangeHelp(denominations.length - 1, denominations, value);
	}

	public static int countWaysToMakeChangeHelp(int ind, int a[], int T) {

		if (ind == 0) {
			if (T % a[ind] == 0)
				return 1;
			else
				return 0;
		}

		int notTake = countWaysToMakeChangeHelp(ind - 1, a, T);
		int take = 0;
		if (a[ind] <= T)
			take = countWaysToMakeChangeHelp(ind, a, T-a[ind]);

		return notTake + take;

	}
	
	public static void main(String[] args) {
		
		
		int denominations[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int val = 301;
		System.out.println(countWaysToMakeChange(denominations, val));
		
	}

}
