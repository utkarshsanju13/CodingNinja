package array_2_Searching_and_Sorting;

public class selectionSort {
	
		public static void main(String[] args) {
			
			int arr[] = { 1, 7, 14, 0, 9, 4, 18, 18, 2, 4, 5};
			selectionSort(arr);
				
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	
	 public static void selectionSort(int[] arr) {
	    	//Your code goes here
	        int n = arr.length;
	        for(int i = 0 ; i < n-1 ; i++){
	            
	            int min = Integer.MAX_VALUE;
	            int minPosition = -1;
	            for(int j = i; j < n; j++){
	                
	                if(arr[j] <= min){
	                    min = arr[j];
	                    minPosition = j;
	                }
	            }
	            int temp = arr[i];
	            arr[i] = arr[minPosition];
	            arr[minPosition] = temp;
	        }
	    }   

	    public static void swap(int arr[], int i, int j){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
