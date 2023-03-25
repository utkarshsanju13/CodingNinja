package priorityQueue;

public class CheckMaxHeao {
	
	public static void main(String[] args) {
		
		int arr[] = {42, 20, 18, 6, 14, 11, 9, 4};
		
		System.out.println(checkMaxHeap(arr));
		
		
	}

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		int n = arr.length;
		 for(int i = n-1; i >0; i--){

			 int childIndex = i;
			 int parentIndex = (i -1)/2;

			 if(arr[parentIndex] < arr[childIndex]){
				 return false;
			 }
		 }

		 return true;
	}
}
