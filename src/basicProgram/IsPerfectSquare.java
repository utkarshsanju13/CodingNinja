package basicProgram;

/*
 * Check whether the number is perfect square or not by using he binary search 0(1) space complexity
*/
public class IsPerfectSquare {
	
	private static boolean isPerferctSquare(int n) {
		
		long left = 1; long right = n;
		
		while(left<=right) {
			
			long mid = (left + right) /2 ;
			
			if(mid * mid == n) {
				return true;
			}
			
			if(mid * mid < n) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		 int n = 81;
		 System.out.println(n +" is Perfect Square = "+isPerferctSquare(n));

	}
}
