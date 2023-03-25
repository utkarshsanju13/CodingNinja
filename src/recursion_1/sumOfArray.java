package recursion_1;

public class sumOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println(sum(arr));
		
	}
	
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length == 0)
            return 0;
        
		int temp[] = new int[input.length - 1];
        for(int i = 0; i < input.length-1; i++){
            temp[i] = input[i];
        }
        int sum = input[input.length -1] + sum(temp);
        
        return sum;
	}
}
