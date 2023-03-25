package stack;

import exception.StackEmptyException;
import exception.StackFullException;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
	}
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
	
	StackUsingArray stk = new StackUsingArray();
	
	stk.push(10);
	stk.push(20);
	System.out.println(stk.pop());
	System.out.println(stk.size());
	System.out.println(stk.isEmpty());
}

	private void push(int i){
		if(topIndex == data.length -1) {
//			throw new StackFullException();
			doubleCapacity();
		}
		data[++topIndex] = i;
	}
	
	private void doubleCapacity() {
		
		int temp[] = data;
		data = new int[2*temp.length];
		
		for(int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	private int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
		
	}
	
	private int size() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return topIndex + 1;
	}
	
	private boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		
		return false;
	}
}

