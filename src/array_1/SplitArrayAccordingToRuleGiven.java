package array_1;

/*Given an integer array A of size N, check if the input array
can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5)
should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.*/

/*Sample Input 1 :
2
1 2
Sample Output 1 :
false
Sample Input 2 :
3
1 4 3
Sample Output 2 :
true*/

public class SplitArrayAccordingToRuleGiven {

	public static void main(String[] args) {
		

	    int arr[] = { 1, 4, 3 };
	    int n = arr.length;
	    
	    System.out.println(SplitArray(arr,n,0,0,0));
	    
	}

	static boolean SplitArray(int arr[], int n, int start, int lsum, int rsum) {

		if (start == n)
			return lsum == rsum;

		if (arr[start] % 5 == 0)
			lsum += arr[start];
		else if (arr[start] % 3 == 0)
			rsum += arr[start];
		else
			return SplitArray(arr, n, start + 1, lsum + arr[start], rsum)
					|| SplitArray(arr, n, start + 1, lsum, rsum + arr[start]);

		return SplitArray(arr, n, start + 1, lsum, rsum);
	}
}
