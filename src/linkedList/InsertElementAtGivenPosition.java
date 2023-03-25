package linkedList;

public class InsertElementAtGivenPosition {

	public static void main(String[] args) {
		 
		Node head = Node.createLinkedList();
		insert(head, 3, 100);
		Node.printLL(head);
		
	}
	
	public static Node insert(Node head, int pos, int data){
		//Your code goes here
       Node prevNode = head;
        Node nextNode = null;
        Node currNode = new Node(data);
        
        if(pos == 0){
            
            currNode.next = head;
            
            return currNode;
        }
        
        int i  = 0;
        while(i < pos - 1 && prevNode.next !=null){
            prevNode = prevNode.next;
            i++;
        }
        
        if(i >= pos -1 ){
            nextNode = prevNode.next;
       		prevNode.next = currNode;
        	currNode.next = nextNode;
        }

        return head;
	}
}
