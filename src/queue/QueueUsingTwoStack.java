package queue;

import java.util.Stack;

import exception.QueueEmptyException;

public class QueueUsingTwoStack {
	
	Stack<Integer> stk1;
	Stack<Integer> stk2;
	int size;
	
	public QueueUsingTwoStack() {
		stk1 = new Stack<>();
		stk2 = new Stack<>();
		size = 0;
	}
	
	public static void main(String[] args) throws Exception {
		QueueUsingTwoStack q = new QueueUsingTwoStack();
		q.enqueu(10);
		q.enqueu(20);
		q.enqueu(30);
		System.out.println(q.front());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());	
	}
	
	public void enqueu(int ele) {
		if(size == 0) {
			stk1.push(ele);
			size++;
		}else {
			
			while(!stk1.isEmpty()) {
				stk2.push(stk1.pop());
			}
			
			stk2.push(ele);
			size++;
			
			while(!stk2.isEmpty()) {
				stk1.push(stk2.pop());
			}
		}
	}
	
	public int dequeue() throws QueueEmptyException {
		
		if(size == 0) {
			throw new QueueEmptyException();
		}
		
		size--;
		return stk1.pop();
	}
	
	public int front() {
		return stk1.peek();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
