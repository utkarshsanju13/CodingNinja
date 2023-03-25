package array_1;

import java.util.HashMap;

/*
 * 
 * count the pair of sum provided
 * 
 * You have been given an integer array/list(ARR) and a number X.
 * Find and return the total number of pairs in the array/list which sum to X.
*/
public class CountPairSum {

	public static void main(String[] args) {
	
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] arr = { 1, 5, 7, -1, 5 };
		int n = arr.length;
		int sum = 6;
		
		/*
		 * insert all element int hashmap (key = arr[i] & value = occurence
		*/
		
		for (int i = 0; i < n; i++) {
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);

			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
//		System.out.println(hm);
		int twice_count = 0;
		/*
		 * if the sum - arr[i] is present the increse twice count by the occurence of
		 * that number
		 */
		 
		for (int i = 0; i < n; i++) {

			if (hm.get(sum - arr[i]) != null)
				twice_count += hm.get(sum - arr[i]);

//			and one more condition if the number itself form a pair then decrese the count
			if (sum - arr[i] == arr[i]) {
				twice_count--;
			}
		}

		System.out.println(twice_count / 2);

	}

}
