package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		
		reverseQueue(q1);
		System.out.println(q1);
	}
	
	public static void reverseQueue(Queue<Integer> q) {
		
		if(q.size() == 0 || q.isEmpty()) {
			return ;
		}
		
		int temp = q.remove();
		reverseQueue(q);
		q.add(temp);
	}
}
