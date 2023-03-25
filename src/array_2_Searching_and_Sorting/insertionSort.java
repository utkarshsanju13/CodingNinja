package array_2_Searching_and_Sorting;

public class insertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 13, 4, 1, 3, 6, 28};
		insertionSort(arr);
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			
		}
	}
	
	public static void insertionSort(int[] arr) {
		
		 int n = arr.length;
		 
			/*
			 * sorted | unsorted
			 *  the unsorted array start with 1
			 *  picking one by one elements of unsorted array 
			 *  and insert in correct place in sorted array  
			 */
		 
	        for(int i = 1 ; i < n; i++){
	            
	            int key = arr[i];
	            int j = i-1;
				/*
				 * this loop runs in backward direction in sorted array and as the sorted array
				 * element in greater than arr[i] (unsorted array's element) shift the jth
				 * element with (j +1)th element
				 */
	            while(j >=0 && arr[j] > key){
	                
	                arr[j+1] = arr[j];
	                j--;
	            }
	         //at last isert the key element at the correct place as the while loop en   
	            arr[j+1] = key;
	        }
	    }


}
