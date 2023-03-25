package array_2_Searching_and_Sorting;

public class sumOfTwoArray {

	public static void main(String[] args) {
		
		int arr1[] = {9, 7, 6, 1};
		int arr2[] = {4, 5, 9};
		
		int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
		
		sumOfTwoArrays(arr1, arr2, output);
		
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        int x = output.length;
        int carry = 0;
        int i = n-1;
        int j = m-1;
        int k = x - 1;
        
        
        while(i >= 0 && j >= 0 && k >=0){
            
            int sum = arr1[i] + arr2[j] + carry;
            
            carry = sum / 10;
            
            int temp = sum % 10;
    		output[k] = temp;
            
            i--;
            j--;
            k--;
        }
        
        while(i >= 0){
            
            int sum = carry + arr1[i];
            
            carry = sum / 10;
            
            output[k] = sum % 10;
            k--;
            i--;
        }
        
          while(j >= 0){
            
            int sum = carry + arr2[j];
            
            carry = sum / 10;
            
            output[k] = sum % 10;
            k--;
            j--;
        }
        
        if(carry!=0 && k >= 0){
            output[k] = carry;
        }

    }
}
