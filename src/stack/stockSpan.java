package stack;

import java.util.Stack;

/*Afzal has been working with an organization called 'Money Traders' for the past few years.
The organization is into the money trading business. His manager assigned him a task. For a 
given array/list of stock's prices for N days, find the stock's span for each day.
The span of the stock's price today is defined as the maximum number of consecutive days
(starting from today and going backwards) for which the price of the stock was less than today's price.
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], 
then the stock spans will be [1, 1, 1, 2, 1, 4, 6].*/

public class stockSpan {

	public static void main(String[] args) {
		 int price[] = { 100, 80, 60, 70, 60, 75, 85};
		 
		 int span [] = stockSpan(price);
		 
		 for(int i = 0; i < span.length; i++) {
			 
			 System.out.print(span[i] + " ");
		 }
	}
	
	public static int[] stockSpan(int [] price) {
		
		Stack<Integer> stk = new Stack<>();
		stk.push(0);
		int span[] = new int[price.length];
		span[0] = 1;
		
		for(int i = 1; i < price.length; i++) {
			
			while(!stk.isEmpty() && price[i] >= price[stk.peek()]) {
				
				stk.pop();
			}
			
			if(stk.isEmpty()) {
				span[i] = i + 1;
			}else {
				span[i]= i - stk.peek();
			}
			
			stk.push(i);
		}
		
		return span;
	}
}
