package recursion2;

public class removeX {
	
	public static void main(String[] args) {
		
		String str = "xabcdxcfdx";
		System.out.println(removeX(str));
	}
	
	public static String removeX(String input){
		// Write your code here
		
        if(input.length() == 0)
            return input;
        
        String result = removeX(input.substring(1));
        
        if(input.charAt(0) == 'x'){
            return result;
        }else{
            return input.charAt(0) + result;
        }

	}
}
