package stack;

import exception.StackEmptyException;
import linkedList.Node;

public class StackUsingLL {
	
	Node head;
	int size;
	
	private boolean isEmpty() {
		
		if(size == 0)
			return true;
		
		return false;
	}



	private int size() {
		
		return size;
	}



	private int  pop() throws StackEmptyException {
		if(size == 0)
			throw new StackEmptyException();
		
		int temp = head.data;
		head = head.next;
		size--;
		
		return temp;
	}



	private void push(int i) {
		Node newNode = new Node(i);
		newNode.next = head;
		head = newNode;
		size++;
	}
	

	public static void main(String[] args) throws StackEmptyException {
		
		StackUsingLL stk = new StackUsingLL();
		stk.push(10);
		stk.push(20);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		stk.push(10);
		stk.push(20);
		System.out.println(stk.size());
		System.out.println(stk.isEmpty());
		
	}




}
