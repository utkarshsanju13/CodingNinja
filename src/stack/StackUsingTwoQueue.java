package stack;

import java.util.LinkedList;
import java.util.Queue;

import exception.QueueEmptyException;

public class StackUsingTwoQueue {
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	int size = 0;
	
	public static void main(String[] args) throws Exception {
		
		StackUsingTwoQueue stk = new StackUsingTwoQueue();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk.size());
		
	}
	
	public void push(int element) {
		
		if(size == 0) {
			q1.add(element);
			size++;
		}else {
			
			q2.add(element);
			while(!q1.isEmpty()) {
				q2.add(q1.remove());
			}
			size++;
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
		}
	}
	
	public int pop() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		size--;
		return q1.remove();
	}
	
	public int peek() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return q1.peek();
	}
	
	public int size() {
		return size;
	}
}
