package priorityQueue;

import java.util.ArrayList;

public class Priority_QueueUsingMinHeap<T> {

	private ArrayList<Element<T>> heap;
	
	public Priority_QueueUsingMinHeap() {
		heap = new ArrayList<>();
	}
	
	public void insert(T val, int priority) {
		Element<T> e = new Element<>(val, priority);
		heap.add(e);
		
		int childIndex = heap.size() -1;
		int parentIndex = (childIndex-1)/2;
		
		while(childIndex > 0) {
			
			if(heap.get(parentIndex).priority > heap.get(childIndex).priority) {
				
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
	
	public T getMin() throws PriorityQueueException {
		if(isEmpty())
			throw new PriorityQueueException();
		return heap.get(0).val;
	}
	
	public T removeMin() throws PriorityQueueException {
		
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
			
			int minIndex = parentIndex;
			if(heap.get(leftChild).priority < heap.get(minIndex).priority) {
				minIndex = leftChild;
			}
			
			if(rightChild < heap.size() && heap.get(rightChild).priority < heap.get(minIndex).priority) {
				minIndex = leftChild;
			}
			
			if(minIndex == parentIndex)
				break;
			
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex = minIndex;
			leftChild = 2 * parentIndex +1;
			rightChild = 2 * parentIndex +2; 
			
		}
		
		return ans;
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0)
			return true;
		return false;
	}

	public static void main(String[] args) throws PriorityQueueException {
		
		Priority_QueueUsingMinHeap<String> pq = new Priority_QueueUsingMinHeap<>();
		pq.insert("asjjs", 2);
		pq.insert("vbnm", 4);
		pq.insert("ojhjk", 19);
		pq.insert("llll", 67);
		pq.insert("jjjj", 5);
		
		while(!pq.isEmpty()) {
			
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}
}
