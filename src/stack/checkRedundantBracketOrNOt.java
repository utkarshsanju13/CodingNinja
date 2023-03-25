package stack;

import java.util.Stack;

public class checkRedundantBracketOrNOt {

	public static void main(String[] args) {
		
//		String expression = "(a+(b)+c)";//True
		String expression = "(a+b+c)"; //False
		System.out.println(checkRedundant(expression));
	}
	
	public static boolean checkRedundant(String expression) {
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0 ;i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if(ch == ')') {
				int count = 0;
				while(!stk.isEmpty() && stk.peek() != '(') {
					count++;
					stk.pop();
				}
				
				if(count == 0 || count == 1) {
					return true;
				}
				
			}else {
				stk.push(ch);
			}
		}
		return false;
	}
}
