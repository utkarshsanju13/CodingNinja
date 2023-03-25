package linkedList;

public class reverseLinkedList {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedList();
		
		Node result = reverse(head);
		Node.printLL(result);
		
	}

	private static Node reverse(Node head) {
		// TODO Auto-generated method stub
		
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
		
	}
}
