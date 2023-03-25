package strings;

public class reverseEachWordInString {

	public static void main(String[] args) {
		
		String str = "The moon is shining";
		
		System.out.println(reverseEachWord(str));
		
		    int arr[][]=new int[4][5];
		    for(int i=0;i<5;i++)
		    {
		        arr[i][0]=2;
		    }
		    System.out.print(arr[3][0]);
		
	}
	
	public static String reverseEachWord(String str) {
		
		String ans = "";
		int n = str.length();
		int currentStart = 0;
		int i = 0;
		for(;i < n ; i++) {
			
			if(str.charAt(i) == ' ') {
				
				int currentEnd = i - 1;
				
				String reverseWord = reverse(str.substring(currentStart, currentEnd + 1));
				
				ans = ans + reverseWord + " ";
				currentStart = i + 1;
				
			}
		}
		
		int currentEnd = n -1;
		
		String reverseWord = reverse(str.substring(currentStart, currentEnd + 1));
		ans = ans + reverseWord;

		return ans;
		
	}

	private static String reverse(String substring) {
		// TODO Auto-generated method stub
		int n = substring.length();
		String result = "";
		for(int i = 0 ; i < n; i++) {
			
			result = substring.charAt(i) + result;
		}
		return result;
	}
}
