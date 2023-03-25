package array_1;

/*You have been given an empty array(ARR) and its size N. The only input taken
from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the
range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.*/

public class arrangeNumberInArray {

	public static void main(String[] args) {
		
		int n = 8;
//		output = 1 3 5 6 4 2
		int arr[] = new int[n];
		
		arrange(arr,n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] arrange(int[] arr, int n) {
		
		
        int i = 0;
        int j = arr.length -1;
        int num = 1;
        while(i < j && num <= n){
            
            arr[i] = num;
            num++;
            arr[j] = num;
            num++;
            i++;
            j--;
            
        }
        
        if(n%2 != 0){
            arr[n/2] = num;
        }
        
        return arr;
    }
}
