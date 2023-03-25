package priorityQueue;

import java.util.PriorityQueue;

//Given an array A of random integers and an integer k,
//find and return the kth largest element in the array.
//Note: Try to do this question in less than O(N * logN) time.

public class KthLargestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {2, 6, 10, 11, 13, 4, 1, 20};
		int k = 4;
		
		System.out.println(kthLargest(arr.length, arr, k));
		
	}
	
	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		// int n = input.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i = 0 ; i < n ; i++){
			pq.add(input[i]);
		}
		// System.out.println(pq);
	int result = 0;
		for(int i = 0 ; i <= (input.length - k); i++){
			result  = pq.poll();
			// System.out.println(pq);
		}

		return result;
	}

}
