package linkedList;

public class nextNumber {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedListForNextNumberProblem();
		
		Node newHead = addOne(head);
		
		Node.printLL(newHead);
	}

	private static Node addOne(Node head) {
		// TODO Auto-generated method stub
		Node newHead = reverseLL(head);
		Node newHeadTemp = newHead;
		Node temp = null;
//		Node.printLL(newHead);
		
		int carry = 1;
		
		while(newHead != null) {
			int ele = newHead.data;
			ele = ele + carry;
			carry = ele / 10;
			int sum = ele % 10;
			newHead.data = sum;
			
			temp = newHead;
			newHead = newHead.next;
		}
		
		if(carry > 0) {
			temp.next = new Node(carry);
		}
		
		return reverseLL(newHeadTemp);
	}

	private static Node reverseLL(Node head) {
		
		if(head == null || head.next == null)
			return head;
		
		Node prev = null;
		Node temp = head;
		
		while(temp!=null) {
			Node t = temp.next;
			temp.next = prev;
			prev = temp;
			temp = t;
		}
		
		return prev;
	}
	
}
