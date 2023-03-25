package linkedList;

public class InsertInLinkedListRecursivily {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedList();
//		Node result = insertR(head,34,2);
		 fun(head);
//		Node.printLL(head);
	}
	
	public static Node insertR(Node head, int x, int pos) {
		
		if(pos == 0) {
			Node newNode = new Node(x);
			newNode.next = head;
			return newNode;
		}else {
			Node smallerHead = insertR(head.next, x, pos-1);
			head.next = smallerHead;
			return head;
		}
	}
	
	public static void fun(Node start) {
		  if(start == null)
			    return;
			  System.out.print( start.data); 

			  if(start.next != null )
			    fun(start.next.next);
			  System.out.print(start.data);

	}
}
