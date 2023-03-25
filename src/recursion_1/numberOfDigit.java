package recursion_1;

public class numberOfDigit {
	public static void main(String[] args) {
		
		System.out.println(count(102839888));
	}
	
	public static int count(int n){
		//Write your code here
        
        if(n == 0)
            return 0;
         int smallOutput = count(n/10);
        int result = 1 + smallOutput;
            
        return result;

    }

}
