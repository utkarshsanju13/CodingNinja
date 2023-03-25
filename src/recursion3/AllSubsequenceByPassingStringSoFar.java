package recursion3;

public class AllSubsequenceByPassingStringSoFar {

	public static void main(String[] args) {
		
		String str = "abc";
		subsequence(str, "");
		
	}
	
	public static void subsequence(String input, String stringSoFar) {
		if(input.length() == 0) {
			System.out.println(stringSoFar);
			return;
		}
		
		String smallInput = input.substring(1);
		subsequence(smallInput, stringSoFar);
		subsequence(smallInput, stringSoFar+ input.charAt(0));
		
	}
}
