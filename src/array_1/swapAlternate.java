package array_1;

public class swapAlternate {
	
	public static void main(String[] args) {
		
		int[] arr = {9, 3, 6, 12, 4, 32};
		int n = arr.length;
		swapAlternate(arr);
		for(int i = 0 ; i < n; i++) {
			
			System.out.print(arr[i] + " ");
			
		}	
	}
	
	 public static void swapAlternate(int arr[]) {
	    	//Your code goes here
	        int n = arr.length;
	        for(int i = 0; i < n - 1 ; i= i + 2){
	            
	            int temp = arr[i];
	            arr[i] = arr[i + 1];
	            arr[i+1] = temp;
	        }
	        
	    }
}
