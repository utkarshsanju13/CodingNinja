package dp_assignment;

public class SubsetSumRecursive {
	
	 public static boolean isSubsetPresent(int[] arr, int n, int sum) {

	       return isSubset(n-1, sum, arr);
	    }

	private static boolean isSubset(int ind, int target, int[] arr) {
		
		if(target == 0)
			return true;
		
		if(ind == 0)
			return arr[0] == target;
		
		boolean notTake = isSubset(ind-1, target, arr);
		boolean take = false;
		
		if(arr[ind] <= target) {
			take = isSubset(ind-1, target - arr[ind], arr);
		}
	
		return notTake || take;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {4, 2, 5, 6, 7};
		int target = 14;

				
		
		System.out.println(isSubsetPresent(arr, n, target));
	}

}
