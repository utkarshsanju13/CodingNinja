package strings;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1  = "";
		String str2 = "a";
		
		System.out.println(isPermutation(str1, str2));
	}
	
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        
       int sum1 =  calculateASCIISum(str1);
       int sum2 =  calculateASCIISum(str2);
        
        if(sum1 == sum2)
            return true;
        
        return false;
	}
    
    public static int calculateASCIISum(String str){
        
        int n = str.length();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            
            sum = sum + str.charAt(i);
        }
        System.out.println(sum);
        return sum;
    }


}
