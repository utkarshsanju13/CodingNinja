package array_2_Searching_and_Sorting;

public class arrayRotation {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2;
		
		rotate(arr, d);
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    public static void reverse(int [] arr, int s, int e){
        
        while(s < e){
            
            int temp = arr[s];
            arr[s] = arr[e]; 
            arr[e] = temp;
            s++;
            e--;
        }
        
    }
}
