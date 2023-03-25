package linkedList;

public class EvenAfterOdd {

	public static void main(String[] args) {
		
		Node head = Node.createLinkedList();
		
		Node.printLL(evenAfterOdd(head));
	}
	
	public static Node evenAfterOdd(Node head) {
		//Your code goes here
        
        if(head == null || head.next == null){
            return head;
        }
        
    Node oddHead = null,oddTail = null, evenHead = null, evenTail = null;
        
        while(oddHead!=null &&  oddTail != null && evenHead !=null && evenTail != null){
            
            int data = head.data;
            
            if(data %2 != 0){
            	
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }else{
                
                if(evenHead == null){
                    evenHead = head;
                    evenTail = head;
                }else{
                    
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }
             head = head.next;
        }
        
        
        if(oddHead == null){
            return evenHead;
        }else{
            oddTail.next = evenHead;
        }
        
        if(evenHead == null){
            return oddHead;
        }
        
        return oddHead;
        
	}
}
