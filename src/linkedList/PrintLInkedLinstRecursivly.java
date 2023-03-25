package linkedList;

public class PrintLInkedLinstRecursivly {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedList();
		
		printRecursive(head);
		Node.printLL(head);
	}
	
	public static void printRecursive(Node head) {
		
		if(head == null)
			return;
		
		System.out.println(head.data);
		printRecursive(head.next);
//		System.out.println(head.data);
//		If we want to print reverse of LL then add syso after recursive call
	}
}
