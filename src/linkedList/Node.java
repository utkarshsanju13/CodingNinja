package linkedList;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data){
		this.data = data;
	}
	
	public static Node createLinkedList() {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	
	public static Node createLinkedList1() {

		Node n1 = new Node(12);
		Node n2 = new Node(39);
		Node n3 = new Node(44);
		Node n4 = new Node(89);
		Node n5 = new Node(90);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	
	public static Node createLinkedListForNextNumberProblem() {

//		Node n1 = new Node(1);
//		Node n2 = new Node(3);
//		Node n3 = new Node(4);
//		Node n4 = new Node(8);
//		Node n5 = new Node(9);
		
		Node n1 = new Node(9);
		Node n2 = new Node(9);
		Node n3 = new Node(9);
		Node n4 = new Node(9);
		Node n5 = new Node(9);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}
	
public static void printLL(Node head) {
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
}
