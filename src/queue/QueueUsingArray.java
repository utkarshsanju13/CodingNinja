package queue;

import exception.QueueEmptyException;


public class QueueUsingArray {

	static int data[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public static void main(String[] args) throws Exception {
		
		QueueUsingArray q = new QueueUsingArray(2);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		printQueue(data);
		System.out.println(q.front());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		printQueue(data);
	}
	
	private static void printQueue(int[] data2) {
	
		for(int i = 0 ; i < data2.length; i++) {
			System.out.print(data2[i]+ " ");
		}
		System.out.println();
	}
	
	public void enqueue(int ele) {
		if(size == data.length) {
//			throw new QueueFullException();
			doubleCapacity();
		}
		
		if(size == 0) {
			front++;
		}
//		rear++;
//		if(rear == data.length) {
//			rear = 0;
//		}
		//This is the case when front move forward and rear need to enter element 
		// from 0th index
		rear = (rear + 1) % data.length;
		
		data[rear] = ele;
		size++;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i = front ;i < temp.length; i++)
			data[index++] = temp[i];
		for(int i = 0 ;i < front; i++)
			data[index++] = temp[i];
	
		front = 0;
		rear = temp.length -1;
	}

	public int dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		
		int temp = data[front];
//		front++;
//		if(front == data.length) {
//			front = 0;
//		}
		front = (front + 1) % data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp; 
	}
	
	public int front() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		
		return data[front];
	}
	
	public boolean isEmpty() {
	
		return size == 0;
	}
	
	public int size() {
		
		return size;
	}
}
