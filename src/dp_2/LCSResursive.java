package dp_2;

public class LCSResursive {
	
	public static int lcsRecursive(String str1, String str2,int i,int j) {
		
		if(i == str1.length() || j == str2.length()) {
			return 0;
		}
		int myAns;
		if(str1.charAt(i) == str2.charAt(j)) {
			
			myAns =  1 + lcsRecursive(str1, str2, i+1, j+1);
		}else{
			int ans1 = lcsRecursive(str1, str2, i+1, j);
			int ans2 = lcsRecursive(str1, str2, i, j+1);
			
			myAns =  Math.max(ans1, ans2);
		}
		
		return myAns;
	}
	
	public static void main(String[] args) {
		
		String str1 = "bedgmc";
		String str2 = "abdfglc";
		
		System.out.println(lcsRecursive(str1, str2, 0, 0));
	}
	

}
