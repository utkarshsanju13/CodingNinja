package recursion3;

public class MinimumInTheArray {
	
	public static void main(String[] args) {
		int arr[] = { 2,5, 1, 10, 3};
		minimum(arr, 0, Integer.MAX_VALUE);
		
	}
	
	public static void minimum(int [] arr,int startIndex, int minSoFar) {
		
		if(startIndex == arr.length) {
			System.out.println(minSoFar);
			return;
		}
		
		if(arr[startIndex] < minSoFar) {
			minSoFar = arr[startIndex];
		}
		
		minimum(arr, startIndex + 1, minSoFar);
	}

}
