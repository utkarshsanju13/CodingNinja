package linkedList;


class DoubleNode{
	
	Node head;
	Node tail;
	public DoubleNode(){
		
	}
	
	public DoubleNode(Node head, Node tail) {
		
		this.head = head;
		this.tail = tail;
	}
}

public class ReverseLinkedListRecursivelyN2 {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedList();
		
//		Node result = reverseR(head);
//		DoubleNode result = reverseRInNComplexity(head);
//		Node.printLL(result.head);
		
		Node result = ReverseBestN(head);
		Node.printLL(result);
	}
	
	//This is solution in n2 complexity.
	public static Node reverseR (Node head) {
		
		if(head == null || head.next == null)
			return head;
		
		Node smallHead = reverseR(head.next);
		Node tail = smallHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		
		tail.next = head;
		head.next = null;
		
		return smallHead;
		
		
	}
	
	//This solution has n complexity but it must have head and tail as argument
	public static DoubleNode reverseRInNComplexity(Node head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode smallAns = reverseRInNComplexity(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		
		return ans;
	}
	
	public static Node ReverseBestN(Node head) {
	
		if(head == null || head.next == null)
			return head;
		
		Node smallHead = ReverseBestN(head.next);
		Node tail = head.next;
		tail.next = head;
		head.next = null;
		
		return smallHead;
	}
}
