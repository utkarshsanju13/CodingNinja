package priorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//You want to buy a ticket for a well-known concert which is happening in your city. 
//But the number of tickets available is limited. Hence the sponsors of the concert decided 
//to sell tickets to customers based on some priority.
//A queue is maintained for buying the tickets and every person is attached with a priority
//(an integer, 1 being the lowest priority).

//Sample Input 1 :
//3
//3 9 4
//2
//Sample Output 1 :
//2
//Sample Output 1 Explanation :
//Person with priority 3 comes out. But there is a person with higher priority than him.
//So he goes and then stands in the queue at the end. Queue's status :  {9, 4, 3}. Time : 0 secs.
//Next, the person with priority 9 comes out. And there is no person with higher priority than him.
//So he'll get the ticket. Queue's status :  {4, 3}. Time : 1 secs.
//Next, the person with priority 4 comes out (which is you). And there is no person with higher priority than you.
//So you'll get the ticket. Time : 2 secs.
class Pair {
	int value;
	int index;
}

public class BuyTicket {
	
	public static void main(String[] args) {
		
		int [] arr = {2, 3, 2, 2, 4};
		
		int k = 3;
		System.out.println(buyTicket(arr, k));    
	}
	
	public static int buyTicket(int [] arr, int k) {
		
		int n = arr.length;
		//Maintaing the queue as the index of that element can't be lost
		Queue<Pair> q = new LinkedList<>();
		
        //Priority queue is maintained in Max heap so that the max element is returned int the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0 ; i < n; i++) {
			
			Pair p = new Pair();
			p.value = arr[i];
			p.index = i;
			q.add(p);
			
			pq.add(arr[i]);	
		}
		
		int count = 0 ; 
		  	
		while(!q.isEmpty()) {
			
			if(q.peek().value == pq.peek()) {
				
				pq.remove();
				Pair pair = q.poll();
				count++;
				if(pair.index == k) {
					break;
				}
			}else {
				q.add(q.poll());
			}
		}
		
		return count;
	}

}
