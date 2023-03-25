package strings;

public class allSubstring {

	public static void main(String[] args) {
	
		String str = "abshdkd";
		printSubstrings(str);
}
	
	public static void printSubstrings(String str) {
		//Your code goes here
        
        int n = str.length();
        
        for(int i = 0; i < n; i++){
            
            for(int j = i ; j < n; j++){
                
                System.out.println(printString(str,i,j));
                
            }    
        }
	}
    
    public static String printString(String str, int start, int end){
        
        String result = "";
        while(start <= end){
            
            result+=str.charAt(start);
            start++;
        }
        
        return result;
    }

}
