package array_1;

public class uniqueElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,1,3};
		int sumxor = 0;
		for(int i = 0 ; i < arr.length; i++) {
			
			sumxor = sumxor ^ arr[i];
//			System.out.println(i +" the iteration " + sumxor );
		}
		
		System.out.println(sumxor);
		
		
	}
}
