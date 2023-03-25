package dp_1;

public class MinimumNumberOfSquare {
	
	public static int minimumNumberOfSquareRecursive(int n) {
		
		if(n == 0)
			return 0;
		
		int minAns = Integer.MAX_VALUE;
		for(int i = 1 ; i*i <= n; i++) {
			int currAns = minimumNumberOfSquareRecursive(n-(i*i));
			if(minAns > currAns) {
				minAns = currAns;
			}
		}
		
		int myAns = 1 + minAns;
		
		return myAns;
				
	}
	
	public static void main(String[] args) {
		int n = 7;
		System.out.println(minimumNumberOfSquareRecursive(n));
	}
}
