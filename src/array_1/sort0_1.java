package array_1;

public class sort0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
		sortZeroesAndOne(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int l = 0; 
        int r = n -1;
        
        while(l < r){
            
            if(arr[l] == 1){
                swap(arr,l,r);
                r--;
            } if(arr[r] == 0){
                swap(arr,l,r);
                l++;
            }
            
             if(arr[l] == 0 && arr[r] == 1) {
        	   l++;
        	   r--;
           }
            
        }
    }
    
    public static void swap(int []arr, int l, int r){
        
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
    }
}
