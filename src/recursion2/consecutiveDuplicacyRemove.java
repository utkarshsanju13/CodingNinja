package recursion2;

public class consecutiveDuplicacyRemove {

	public static void main(String[] args) {
		
		String str = "aabccbaa";
		
		System.out.println(removeConsecutiveDuplicates(str));
	}
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1));
        }else{
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
	}


}
