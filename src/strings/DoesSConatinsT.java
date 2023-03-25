package strings;

/*Given two string s and t, write a function to check if s contains all
characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of
t=”coding” in the same order. So function will return true.*/

public class DoesSConatinsT {

	public static void main(String[] args) {
		
		String s = "abchjsgsuohhdhyrikkknddg";
		String t = "coding";
		
		System.out.println(doesSContainsT(s, t));
		
		
	}
	
	public static boolean doesSContainsT(String a, String b) {
		
		
		int al = a.length();
		int bl = b.length();
		
		 if(bl > al)
	            return false;
	        
	        int i = 0;
	        int j = 0;
	        
	        while(i < al && j < bl){
	            
	            if(a.charAt(i) == b.charAt(j)){
	                // result = true;
	                i++;
	                j++;
	            }else
	                i++;
	        }
	        
	        if(j == bl)
	            return true;
	        
	        return false;
	            
		}
}
