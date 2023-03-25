package array_2_Searching_and_Sorting;

public class bubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,56,7,3,9};
		bubbleSort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	 public static void bubbleSort(int[] arr){
	    	//Your code goes here
	        int n = arr.length;
	        int i = 0;
	        
	        while(i < n-1){
	            
	            int j = 0;
	            while(j < n-i - 1){
	                
	                if(arr[j] > arr[j+1]){
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	                
	                j++;
	            }
	            
	            i++;
	        }
	    }  
}
