package array_2_Searching_and_Sorting;

public class PushZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2,0,0,9,0,4,5,0};
		
		pushZerosAtEnd(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}

	}

	 public static void pushZerosAtEnd(int[] arr) {
	    	//Your code goes here
	        
	        int n = arr.length;
	        
	        int i = 0, k = 0;
	        
	        while(i < n){
	           
	            if(arr[i] == 0){
	                i++;
	            }else{
	                swap(arr,i,k);
	                i++;
	                k++;
	            }
	        }
	    }
	    
	    public static void swap(int arr[], int i, int k){
	        
	        int temp = arr[i];
	        arr[i] = arr[k];
	        arr[k] = temp;
	    }
}
