package array_2_Searching_and_Sorting;


/*You have been given two sorted arrays/lists(ARR1 and ARR2)
of size N and M respectively, merge them into a third array/list
such that the third array is also sorted.*/

public class mergeTwoSortedArray {

	public static void main(String[] args) {
		 
		int arr1[] = {1,3,5,8,10,17,43};
		int arr2[] = {2,4,5,7,8,9,14};
		
		int result[] = merge(arr1,arr2);
		
		for(int i = 0 ; i < result.length; i++) {
			
			System.out.print(result[i]  + " ");
		}
		
	}
	
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int m = arr2.length;
        int n = arr1.length;
        
        int result [] = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m && k < result.length){
            
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else if(arr2[j] < arr1[i]){
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        
        
        while(i < n && k < result.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        
         while(j < m && k < result.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        
        return result;
    }
}
