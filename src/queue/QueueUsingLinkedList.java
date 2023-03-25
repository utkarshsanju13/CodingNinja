package queue;

import exception.QueueEmptyException;
import linkedList.Node;

public class QueueUsingLinkedList {

	Node front;
	Node rear;
	int size;
	
	public QueueUsingLinkedList(){
		front = null;
		rear = null;
		size = 0;
	}
	
	public static void main(String[] args) throws Exception {
		
		QueueUsingLinkedList q = new QueueUsingLinkedList();
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
		Node newNode = new Node(ele);
		if(size == 0) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = rear.next;
		}
		size++;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		int temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}
	
	public int front() {
		return front.data;
	}
	
	public int size() {
	return size;	
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
}
