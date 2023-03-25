package recursion_1;

public class checkNumberInArray {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,45,6,4,7};
		System.out.println(checkNumber(arr, 45));
		
	}
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(input.length == 0)
            return false;
        
        int temp[] = new int[input.length - 1];
        
        for(int i = 0 ; i < input.length - 1; i++){
            temp[i] = input[i];
        }
        
        if(input[input.length - 1] == x)
            return true;
        
        boolean check = checkNumber(temp,x);
        
        return check;
		
	}
}
