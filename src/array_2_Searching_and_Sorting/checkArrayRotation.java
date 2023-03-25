package array_2_Searching_and_Sorting;


/*You have been given an integer array/list(ARR) of size N. It has been 
sorted(in increasing order) 
and then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K',
that means, the index from which the array/list has been rotated.*/

public class checkArrayRotation {

	public static void main(String[] args) {
		
		int arr[] = { 5, 6, 1, 2, 3, 4 };
		int n = arr.length;
		
		System.out.println(arrayRotateCheck(arr));
		
	}
	
	 public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	        int n = arr.length;
	        int result = 0;
	        
	        if(n == 0)
	            return 0;
	        
	        for(int i = 0 ; i < n-1; i++){
	            
	            if(arr[i+1] < arr[i])
	                result = i;
	        }
	        
	        if(result == 0)
	            return 0;
	        return result+1;
	    }
}
