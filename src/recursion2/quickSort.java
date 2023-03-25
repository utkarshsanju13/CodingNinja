package recursion2;

public class quickSort {

	public static void main(String[] args) {
		
		int arr[] = { 7, 6, 8, 5,11,18, 4, 3,2,1,14 };
		quickSort(arr);
		printArray(arr);
	}  
	
	public static void quickSort(int arr[]) {
		
		if(arr.length <= 1)
			return;
		
		int pivot = partition(arr);
		System.out.println(pivot);
		int a[] = new int[pivot];
		int b[] = new int[arr.length - pivot - 1];
		
		for(int i= 0; i < pivot; i++) {
			a[i] = arr[i];
		}
		printArray(a);
		for(int i = pivot + 1; i < arr.length; i++) {
			b[i - pivot - 1] = arr[i];
		}
		printArray(b);
		quickSort(a);
		quickSort(b);
		
	}

	private static int partition(int[] arr) {
		// TODO Auto-generated method stub
		
		int pivot = arr[0];
		
		int smallEleCount = 0;
		
		for(int i = 1 ; i < arr.length; i++) {
			
			if(arr[i] < pivot)
				smallEleCount ++;
		}
		
		int temp = arr[smallEleCount];
		arr[smallEleCount] = pivot;
		arr[0] = temp;
		
		int i = 0;
		int j = arr.length-1;
		
		while(i < j) {
			if(arr[i] < pivot) {
				i++;
			}else if(arr[j] >= pivot) {
				j--;
			}else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}	
		}
		
		return smallEleCount;
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
	}
}
