package array_2_Searching_and_Sorting;

public class binarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 3, 7, 9, 10, 13 };
		System.out.println(binarySearch(arr, 9));
		
		
	}
	
	 public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        
	        int start = 0;
	        int end = arr.length -1;
	        
			/*
			 * NOTE: start <= end eqaul to important because at last both comes on one index
			 * inthis case is 3 and then mid is calculated 3+3/2 = 3
			 */
	        
	        while(start <= end){
	            
	            int mid = (start + end) / 2;
	            
	            if(arr[mid] < x)
	                start = mid + 1;
	            else if(arr[mid] > x)
	                end = mid - 1;
	            else if(arr[mid] == x)
	                return mid;
	        } 
	        return -1;
	    }
}
