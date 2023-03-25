package priorityQueue;

import java.util.ArrayList;

public class KsmallestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		int n = arr.length;
		int k = 4;
		
		System.out.println(kSmallest(n, arr, k));
	}
	
	public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		// Write your code here

		// int n = arr.length;
		ArrayList<Integer> heap = new ArrayList<>();

		for(int i = 0; i < k; i++){
			heap.add(arr[i]);

			int childIndex = heap.size() -1;
			int parentIndex = (childIndex-1)/ 2;

			while(childIndex > 0){
				
				if(heap.get(childIndex) > heap.get(parentIndex)){
					int temp = heap.get(childIndex);
					heap.set(childIndex, heap.get(parentIndex));
					heap.set(parentIndex, temp);

					childIndex = parentIndex;
					parentIndex = (childIndex-1) /2;
				}else{
					break;
				}
			}
		}
		
//		System.out.println(heap);
		
		for(int i = k; i < n; i++) {
			if(heap.get(0) > arr[i]) {
				
				int temp = heap.get(0);
				heap.set(0, arr[i]);
//				heap.remove()
				
				int parentIndex = 0;
				int leftChild = 2 * parentIndex +1;
				int rightChild = 2* parentIndex +2;
				
				while(leftChild < heap.size()) {
					
					int maxIndex = parentIndex;
					
					if(heap.get(leftChild) > heap.get(maxIndex)) {
						maxIndex = leftChild;
					}
					
					if(rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)) {
						maxIndex = rightChild;
					}
					
					if(parentIndex == maxIndex) {
						break;
					}
					
					int temp1 = heap.get(parentIndex);
					heap.set(parentIndex, heap.get(maxIndex));
					heap.set(maxIndex, temp1);
					
					parentIndex = maxIndex;
					leftChild = 2 * parentIndex +1;
					rightChild = 2* parentIndex +2;
					
				}
				
			}
		}
		
//		System.out.println(heap);
		
		
		
		return heap;


		

	}

}
