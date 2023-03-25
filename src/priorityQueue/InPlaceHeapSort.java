package priorityQueue;

//Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
//Note: Space complexity should be O(1).
public class InPlaceHeapSort {
	
	public static void main(String[] args) {
		
		int [] arr = {2, 6, 8, 5, 4, 3};
		inplaceHeapSort(arr);
		print(arr);
	}
	
	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		
		int n = arr.length;
		
		for(int i = (n/2) -1; i >= 0; i--){
			downHeapify(arr, i, n);
		}
		
		for(int i = n-1; i>=0; i--){
			
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			downHeapify(arr, 0, i);
		}
	}
	
	public static void downHeapify(int [] arr, int i, int n){
		
		int parentIndex = i;
		int leftChild = 2 * parentIndex +1;
		int rightChild = 2 * parentIndex + 2;

		while(leftChild < n){
			int minIndex = parentIndex;

			if(arr[leftChild] < arr[minIndex]){
				minIndex = leftChild;
			}

			if(rightChild < n && arr[rightChild] < arr[minIndex]){
				minIndex = rightChild;
			}

			if(minIndex == parentIndex)
				break;

				int temp = arr[minIndex];
				arr[minIndex] = arr[parentIndex];
				arr[parentIndex] = temp;

				parentIndex = minIndex;
				leftChild = 2 * parentIndex + 1;
				rightChild = 2 * parentIndex + 2;
		}
	}
	
	public static void print(int [] arr){

		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
