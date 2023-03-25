package priorityQueue;

import java.util.ArrayList;

public class Priority_QueueUsingMaxHeap<T> {
	
	private ArrayList<Element<T>> heap;
	
	public Priority_QueueUsingMaxHeap() {
		heap = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(heap.isEmpty())
			return true;
		return false;
	}
	
	public int getSize() {
		return heap.size();
	}
	
	public T getMax() throws PriorityQueueException {
		if(heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		
		return heap.get(0).val;
	}
	
	public void insert(T val, int priority) {
//		Element<T> ele = new Element<>(val, priority);
//		heap.add(ele);
//		
//		upHeapify();
////		print();
		
		Element<T> e = new Element<>(val, priority);
		heap.add(e);
		
		int childIndex = heap.size() -1;
		int parentIndex = (childIndex-1)/2;
		
		while(childIndex > 0) {
			
			if(heap.get(parentIndex).priority < heap.get(childIndex).priority) {
				
				Element<T> temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				
				childIndex = parentIndex;
				parentIndex = (childIndex -1)/2; 
			}else {
				return;
			}
		}
	}
	
	public void upHeapify() {
		int childIndex = heap.size() -1;
		int parentIndex = (childIndex - 1) /2;
		
		while(childIndex > 0) {

			if(heap.get(childIndex).priority > heap.get(parentIndex).priority){
				Element<T> temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) /2;
			}else {
				return;
			}
		}
	}
	
	public T removeMax() throws PriorityQueueException {
		
		if(isEmpty())
			throw new PriorityQueueException();
		
		Element<T> remove = heap.get(0);
		T ans = remove.val;
		
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int leftChild = 2 * parentIndex +1;
		int rightChild = 2 * parentIndex +2;
		
		while(leftChild < heap.size()) {
			
			int maxIndex = parentIndex;
			if(heap.get(leftChild).priority > heap.get(maxIndex).priority) {
				maxIndex = leftChild;
			}
			
			if(rightChild < heap.size() && heap.get(rightChild).priority > heap.get(maxIndex).priority) {
				maxIndex = leftChild;
			}
			
			if(maxIndex == parentIndex)
				break;
			
			Element<T> temp = heap.get(maxIndex);
			heap.set(maxIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex = maxIndex;
			leftChild = 2 * parentIndex +1;
			rightChild = 2 * parentIndex +2; 
			
		}
		
		return ans;
	}
	
	public void downHeapify() {
		int parentIndex = 0;
		int leftChild = 2 * parentIndex + 1;
		int rightChild = 2 * parentIndex + 2;
		
		
		while(leftChild < heap.size()) {
			int maxIndex = parentIndex;
			
			if(heap.get(leftChild).priority > maxIndex) {
				maxIndex = leftChild;
			}
			
			if(rightChild < heap.size() && heap.get(rightChild).priority > maxIndex) {
				maxIndex = rightChild;
			}
			
			if(maxIndex == parentIndex)
				break;
			
			Element<T> temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(maxIndex));
			heap.set(maxIndex, temp);
			
			parentIndex = maxIndex;
			leftChild = 2 * parentIndex + 1;
			rightChild = 2 * parentIndex + 2;
			
		}
	}
	
	private void print() {
		for(int i = 0 ; i < heap.size(); i++) {
			System.out.print(heap.get(i).val + " ");
		}
		System.out.println();
	}
	
public static void main(String[] args) throws PriorityQueueException {
		
		Priority_QueueUsingMaxHeap<String> pq = new Priority_QueueUsingMaxHeap<>();
		pq.insert("2", 2);
		pq.insert("4", 4);
		pq.insert("19", 19);
		pq.insert("67", 67);
		pq.insert("5", 5);
		
//		pq.print();
		while(!pq.isEmpty()) {
			
			System.out.println(pq.getMax());
			pq.removeMax();
		}
	}



}
