package recursion_1;

public class lastIndexInArray {

	public static void main(String[] args) {
		
		int arr[] = {3,2,5,6,1,7,5,9};
		int x = 5;
		
		System.out.println(lastIndex(arr, x));
		System.out.println(lastIndex2(arr,x,0));
		
	}
//Last Index using the temp array 
	private static int lastIndex(int[] arr, int x) {
		
		if(arr.length == 0)
			return -1;
		
		
		int temp[] = new int[arr.length -1];
		for(int i = 1 ; i < arr.length; i++) {
			
			temp[i -1] = arr[i];
		}
	
		int index = lastIndex(temp, x);
		
		if(index == -1) {
			if(arr[0] == x) {
				return 0;
			}else
				return -1;
		}else {
			return index + 1;
		}
	}
	
	//uing the starting index
	private static int lastIndex2(int[] arr, int x, int si) {
		
		if(si == arr.length)
			return -1;
		
		int index = lastIndex2(arr,x,si+1);
		
		if(index == -1) {
			if(arr[si] == x) {
				return si;
			}else
				return -1;
		}else {
			return index;
		}
	}
}
