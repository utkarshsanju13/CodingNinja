package linkedList;

public class CalculateLength {

	public static void main(String[] args) {
	
		Node head = Node.createLinkedList();
		
		System.out.println(length(head));
	}
	
	public static int length(Node head){
		//Your code goes here
        
		Node temp = head;
        int count = 0;
        while(temp.data != -1){
            count++;
            temp = temp.next;
        }
        
        return count;
	}
}
