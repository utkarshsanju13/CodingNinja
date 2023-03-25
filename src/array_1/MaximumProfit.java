package array_1;
import java.util.*;
public class MaximumProfit {
	
	public static void main(String[] args) {
		 int arr[] = {30, 20, 53, 14};
		 
		 System.out.println(maximumProfit(arr));
	}

	private static int maximumProfit(int[] arr) {

		int n = arr.length;
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < n; i++) {
			
			int ele = arr[i];
			int count = n-i;
			
			if(ele * count > max) {
				max = ele * count;
			}
		}
		
		return max;
		
	}
	
	

}
