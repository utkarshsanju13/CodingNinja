package strings;

/*Minimum Length Word
Send Feedback
Given a string S (that can contain multiple words), you need to
find the word which has minimum length.*/

public class minimumLengthWord {

	public static void main(String[] args) {
		
		String str = "abc de ghihjk a uvw h j";
		System.out.println(minLengthWord(str));
	
	}
	
public static String minLengthWord(String str){
		
		// Write your code here
        int n = str.length();
        int currentStart = 0;
    	String result = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i++){
            
            if(str.charAt(i) == ' '){
                 
                int currentEnd = i -1;
                
                int lengthofWord = (str.substring(currentStart, currentEnd + 1)).length();
                
                if(lengthofWord < min){
                    min = lengthofWord;
                    result = str.substring(currentStart, currentEnd + 1);
                }
                
                currentStart = i + 1;
            }
        }
        
        int currentEnd = n - 1;
        
         int lengthofWord = (str.substring(currentStart, currentEnd + 1)).length();
                
                if(lengthofWord < min){
                    min = lengthofWord;
                    result = str.substring(currentStart, currentEnd + 1);
                }

        return result;
	}
}
