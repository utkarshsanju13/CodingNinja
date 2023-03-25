package recursion_1;


//Find the first index of x in array using the temp array 
//(else method id the starting index method)
public class firstIndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,3, 5, 6, 3 ,5};
		int x = 5;
		
		System.out.println(firstIndex(arr,x));
		System.out.println(firstIndex2(arr,x,0));
	}

//	using the temp array
	private static int firstIndex(int[] arr, int x) {
		
		if(arr.length == 0)
			return -1;
		
		if(arr[0] == x)
			return 0;
		//this temp aray is passed for rest of the element excluding 0th element 
		//for the recursive call.
		int temp[] = new int[arr.length - 1];
		
		for(int i = 1; i < arr.length - 1; i++) {
			
			temp[i - 1] = arr[i];
		}
		
		int index = firstIndex(temp, x);
		
		if(index == -1) {
			return -1;
		}else {
			return index + 1;
		}
		
	}
	
	//using the start index(it does need any temp array)
	private static int firstIndex2(int [] arr, int x, int si) {
		
		if(si == arr.length)
			return -1;
		
		if(arr[si] == x)
			return si;
		
		int index = firstIndex2(arr, x, si+1);
		
		if(index == -1)
			return -1;
		else
			return index;
	}

}
