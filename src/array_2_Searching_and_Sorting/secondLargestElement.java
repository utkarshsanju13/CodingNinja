package array_2_Searching_and_Sorting;

public class secondLargestElement {

	public static void main(String[] args) {
		
		int arr[] = { 1,2,34,32,45,10,45,67};
//		int arr[] = {1,2};
		System.out.println(secondLargestElement(arr));
	}
	
	 public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
	        
	        int n = arr.length;
			
			int secondMax = Integer.MIN_VALUE;
			int max = Integer.MIN_VALUE;
			
			if(n == 0)
				return secondMax;
			
			for(int i = 0; i < n; i++) {
				
				if(arr[i] > max) {
					secondMax = max;
					max = arr[i];
				}else if(arr[i] > secondMax && arr[i] != max) {
					secondMax = arr[i];
				}
			}
			
			return secondMax;
		}
}
