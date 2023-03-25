package linkedList;

public class MergeTwoSortedLL {

	public static void main(String[] args) {
		
		Node head1 = Node.createLinkedList();
		Node head2 = Node.createLinkedList1();
		
		Node.printLL(merge(head1, head2));
		
	}

	public static Node merge(Node head1, Node head2) {
		if(head2.data < head1.data){
          Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        
        Node result = head1;
        
    	
        
        while(head1.next!=null && head2!=null){
            
            if(head1.next.data <= head2.data){
                head1 = head1.next;
            }else {
            	Node next = head2.next;
                head1.next = head2;
                head2.next = head1.next;
                head2 = next;
            }
            
        }
        
        if(head2!=null) {
        	head1.next = head2;
        }
        
        return result;
	}
}
