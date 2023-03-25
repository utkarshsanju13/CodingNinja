package stack;

import java.util.Stack;

public class minimumBracketReversal {
	public static void main(String[] args) {

		String str = "{{{}}}}{";
		System.out.println(countBracketReversals(str));
	}

	public static int countBracketReversals(String input) {
		//Your code goes here
        
        if(input.length() %2 != 0)
            return -1;
        
        Stack<Character> stk = new Stack<Character>();
        
        for(int i = 0; i < input.length(); i++){
            
            char ch = input.charAt(i);
            
            if(ch == '}'){
                
                if(stk.isEmpty()){
                    stk.push(ch);
                }else if(stk.peek() == '{'){
                   	 	stk.pop();
                }else if(stk.peek() == '}'){
                    	stk.push(ch);
                }
                
            }else{
                stk.push(ch);
            }
        }
        
        // System.out.println(stk);
        int count = 0;
        while(!stk.isEmpty()){
            char c1 = stk.pop();
            char c2 = stk.pop();
            
            if(c1!=c2){
                count= count + 2;
            }else{
                count = count + 1;
            }
        }
	return count;
	}
}
