package linkedList;

import java.util.Scanner;

public class TakeInputOfLinkedList {

	public static void main(String[] args) {
		
//		Node head = takeInput();
		Node head = OptimizeTakeInput();
		Node.printLL(head);
	}

	private static Node OptimizeTakeInput() {
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node head = null;
		Node tail = null;
		
		while(data!=-1) {
		Node currNode = new Node(data);
		
			if(head == null) {
				head = currNode;
				tail = currNode;
			}else {
				
				tail.next = currNode;
				tail = currNode;
			}
			
			data = sc.nextInt();
		}
		
		return head;
	}

	

	private static Node takeInput() {
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node currNode = new Node(data);
		
		Node head = null;
		
		while(data != -1) {
			
			if(head == null) {
				head = currNode; 
			}else {
				Node tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				
				tail.next = currNode;
			}
			
			data = sc.nextInt();
			currNode = new Node(data);
		}
		
		return head;
	}
}
