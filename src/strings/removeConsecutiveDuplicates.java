package strings;

public class removeConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbccceeeeedddddddd";
		System.out.println(removeConsecutiveDuplicates(str));
	}
	
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        int n = str.length();
        char ch = str.charAt(0);
        String result = "";
        for(int i = 1; i < n; i++){
        	
            if(ch != str.charAt(i)){
                result += ch;
                ch = str.charAt(i);
            }
        }
        
        result+=ch;
        return result;
	}
}
