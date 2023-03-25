package stack;

import java.util.Stack;

//Reversing the Stack using extra stack

public class reverseStack {
	public static void main(String[] args) {
		
		Stack<Integer> input = new Stack<Integer>();
		Stack<Integer> extra = new Stack<Integer>();
		input.push(5);
		input.push(3);
		input.push(8);
		input.push(2);
		input.push(1);
		input.push(9);
		System.out.println(input);
		reverse(input,extra);
		System.out.println(input);
	}
	
	public static void reverse(Stack<Integer> input, Stack<Integer> extra) {
		
		if(input.size() == 0 || input.size() == 1) {
			return ;
		}
		
		int temp = input.pop();
		
		reverse(input, extra);
		
		while(!input.isEmpty()) {
			extra.push(input.pop());
		}
		
		input.push(temp);
		
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		}
	}
}
