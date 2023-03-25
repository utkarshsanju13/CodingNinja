package strings;

public class reverseStringWordwise {

	public static void main(String[] args) {
		
		String str = "The moon is shining";
		System.out.println(reverseWordWise(str));
		
	}
	
	public static String reverseWordWise(String input) {
		// Write your code here
        int n = input.length();
        String ans ="";
        int currentStart = 0;
        int i = 0;
        for(; i < n; i++){
            
            if(input.charAt(i) == ' '){
                
                int currentEnd = i - 1;
                String subString = input.substring(currentStart,currentEnd + 1);
               	ans = " " + subString + ans;
            	currentStart = i + 1;
            }
        }
        
        int currentEnd = n - 1;
         String subString = input.substring(currentStart,currentEnd + 1);
        ans = subString + ans;
        
        
        return ans;

	}
}
