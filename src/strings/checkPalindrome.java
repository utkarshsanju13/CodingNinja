package strings;

public class checkPalindrome {

	public static void main(String[] args) {
		
		String str = "abccba";
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		//Your code goes here
        
        for(int i = 0 ; i < str.length(); i++){
            
            if(str.charAt(i) != str.charAt(str.length() -1 - i)){
                 
                return false;
            }
        }
        
        return true;
	}


}
