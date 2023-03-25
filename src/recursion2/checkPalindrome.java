package recursion2;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "racecar";
		System.out.println(checkPalindrome(str));
	}

	public static boolean checkPalindrome(String input) {
		 
		 if(input.length() <= 1)
	            return true;
	        
	        if(input.charAt(0) != input.charAt(input.length() - 1))
	           return false;
	        
	        return checkPalindrome(input.substring(1,input.length() - 1));
		}
}
