package linkedList;

public class removeDuplicates {

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(1);
		Node n3 = new Node(1);
		Node n4 = new Node(2);
		Node n5 = new Node(3);
		Node n6 = new Node(3);
		Node n7 = new Node(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		Node head = removeDuplicacy(n1);
		Node.printLL(head);
		
	}

	private static Node removeDuplicacy(Node head) {
	
		if(head == null || head.next == null){
            return head;
        }
      Node temp = head.next;
        int currData = head.data;
        
        Node currNode = head;
        
        while(temp != null){
            
            if(temp.data != currData){
                currData = temp.data;
                Node temporary = temp;
                temporary.next = null;
                currNode.next = temporary;
                
                currNode = currNode.next;
                currNode.next = null;
            }
            
            temp = temp.next;
        }
        
        return head;

		
	
		
	}
}
