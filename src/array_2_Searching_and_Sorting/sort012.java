package array_2_Searching_and_Sorting;

public class sort012 {

	public static void main(String[] args) {
		
		int arr[] = {0,1,2,1,1,1,2,0,0,0,2};
		sort012(arr);
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]);
		}
	}
	
	 public static void sort012(int[] arr){
	    	//Your code goes here
	        int n = arr.length;
	        int i = 0;
	        int j = 0;
	        int k = n-1;

	        while(j <= k){
	            
	            if(arr[j] == 0){
	                swap(arr, i, j);
	                i++;
	                j++;
	            }else if(arr[j] == 1){
	                j++;
	            }else {
	            	swap(arr,j,k);
		            k--;
	            }
	              
	    }
	        
	}
	    
		
	    public static void swap(int[] arr, int i, int j){
	    	
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        
	    }    
}
