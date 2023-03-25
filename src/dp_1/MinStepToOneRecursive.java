package dp_1;

public class MinStepToOneRecursive {
	
	public static int MinStepToOne(int n) {
		
		if(n == 1) {
			return 0;
		}
		
		int ans1;
		ans1 = MinStepToOne(n-1);
		int ans2 = Integer.MAX_VALUE;
		if(n%2 == 0) {
			ans2 = MinStepToOne(n/2);
		}
		int ans3 = Integer.MAX_VALUE;
		if(n%3 == 0) {
			ans3 = MinStepToOne(n/3);
		}
		
		int ans = Math.min(ans1, Math.min(ans2, ans3)) + 1;
		return ans;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(MinStepToOne(n));
	}
	

}
