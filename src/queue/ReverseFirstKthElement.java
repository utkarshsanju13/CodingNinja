package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKthElement {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		System.out.println(q1);
		reverseQueueFirstKthElement(q1, 3);
		System.out.println(q1);
	}

	private static void reverseQueueFirstKthElement(Queue<Integer> q, int k) {
		
		if(k >= q.size()) {
			k = k % q.size();
		}
		
		if(k == 0 || k == 1) {
			return;
		}
		
		reverseQueueforKthElements(q, k);
		
		for(int i = 0 ;i < q.size() - k; i++) {
			q.add(q.remove());
		}
	}

	private static void reverseQueueforKthElements(Queue<Integer> q, int k) {
		// TODO Auto-generated method stub
		
		if(q.size() == 0 || q.size() == 1 || k == 0) {
			return;
		}
		
		int temp = q.remove();
		reverseQueueforKthElements(q, k-1);
		q.add(temp);
		
	}
	
	
}
