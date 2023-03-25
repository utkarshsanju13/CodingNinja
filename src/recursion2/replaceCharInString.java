package recursion2;

public class replaceCharInString {

	public static void main(String[] args) {
		
		String str = "fdfghhfkgigkf";
		
//		replace f by z
		System.out.println(replaceChar(str,'f','z'));
	}
	
	private static String replaceChar(String str, char old, char ne) {
		
		if(str.length() == 0)
			return str;
		
		String result = replaceChar(str.substring(1), old, ne);
		
		if(str.charAt(0) == old) {
			return ne + result;
		}else
			return str.charAt(0) + result;
	}
}
