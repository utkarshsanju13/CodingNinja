package array_1;

public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = { 0, 7, 2, 5, 4, 7, 1, 3, 6 };
		System.out.print(duplicateNumber(arr));

	}
	
	 public static int duplicateNumber(int arr[]) {
	    	//Your code goes here
	        int n = arr.length;
	        int [] count = new int[n - 1];
	        
	        for(int i = 0 ; i< n; i++){
	            
	            count[arr[i]]++;
	            
	            if(count[arr[i]] > 1){
	                return arr[i];
	            }
	        }
	        
	        return -1;
	        
	    }

}
