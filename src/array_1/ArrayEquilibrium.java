package array_1;

/*For a given array/list(ARR) of size 'N,' find and return the 
		'Equilibrium Index' of the array/list.
Equilibrium Index of an array/list is an index 'i' such that
the sum of elements at indices [0 to (i - 1)] is equal to the
sum of elements at indices [(i + 1) to (N-1)]. One thing to note
here is, the item at the index 'i' is not included in either part.
If more than one equilibrium indices are present, then the index
appearing first in left to right fashion should be returned.
Negative one(-1) if no such index is present.

Sample Input 1 :
1
5
1 4 9 3 2
Sample Output 1 :
2*/

public class ArrayEquilibrium {
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,9,3,2};
		
		System.out.println(arrayEquilibriumIndex(arr));
	}

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        int n = arr.length;
        int sumAll = 0;
        int result = -1;
        for(int i = 0; i < n; i++){
            
            sumAll +=arr[i];
        }
        int sumIterative = 0;
        for(int i = 0 ; i < n; i++){
            sumIterative += arr[i];
            int leftSum = sumIterative - arr[i];
            int rightSum = sumAll - sumIterative;
            
            if(leftSum == rightSum)
                result = i;
        }
        
        return result;
	}
}


