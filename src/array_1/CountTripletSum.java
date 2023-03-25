package array_1;

import java.util.Arrays;

/*This count triplet sum will not work for repeating elements like
arr = 5,5,4,4,5,4
sum = 13
count = 9*/


/* reason: 4 4 4 5 5 5 it will not track the previous 2 4's when i is
at 2 so it will not make the triplet pair */

public class CountTripletSum {
	
	public static void main(String[] args) {
		int arr[] = { 6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0  };
		int sum = 5;
		
		
		System.out.println(findTriplet(arr, sum));
	}

	public static int findTriplet(int[] arr, int x) {

		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {

			int l = i + 1;
			int r = arr.length - 1;
			int ele = arr[i];
			while (l < r) {

				if (ele + arr[l] + arr[r] == x) {
					count++;
					System.out.println("count = "+ count + "i= "+ i+ "l= "+ l+ "r= "+ r);
					l++;
					r--;
				}
				else if (ele + arr[l] + arr[r] < x) {
					l++;
				} else
					r--;
			}
		}
		return count;

	}

}
