package stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String ex = "(())";
		
		System.out.println(isBalanced(ex));
	}
	
	 public static boolean isBalanced(String expression) {
	        //Your code goes here
	        
	        Stack<Character> stk = new Stack<Character>();
	        
	        for(int i = 0 ;i < expression.length(); i++){
	            
	            char ch = expression.charAt(i);
	            if(ch == '('){
	                stk.push(ch);
	            }
	            if(ch == ')') {
	            	if(stk.isEmpty()) {
	            		return false;
	            	}
	            	stk.pop();
	            }
	                
	        }
	        
	        return stk.isEmpty();
	    }
}

