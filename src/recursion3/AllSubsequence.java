package recursion3;

public class AllSubsequence {

	public static void main(String[] args) {
		
		String str = "abc";
		String [] result = subsequence(str);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static String[] subsequence(String str) {
		
		if(str.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		String [] smallOutput = subsequence(str.substring(1));
		
		String [] output = new String[smallOutput.length * 2];
		
		for(int i = 0 ; i < smallOutput.length; i++) {
			
			output[i] = smallOutput[i];
		}
		
		for(int i = 0 ; i < smallOutput.length; i++) {
			
			output[smallOutput.length + i] = str.charAt(0) + smallOutput[i];
		}
		
		return output;
	}
}
