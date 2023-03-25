package strings;

public class allSubStringPrint {

	public static void main(String[] args) {

		String str = "pqrst";
		printSubstrings(str);

	}

	public static void printSubstrings(String str) {
		// Your code goes here

		int n = str.length();
		
//      o/p = p pq pqr pqrs pqrst q qr qrs qrst r rs rst s st t
		
//        for(int start = 0; start < n; start++){
//            
//            for(int end = start ; end < n; end++){
//                
//                System.out.print(printString(str,start,end) + " ");
//                
//            }    
//        }

		
//		o/p = p q r s pq qr rs pqr qrs pqrs 
		
		for (int length = 1; length <= n; length++) {

			for (int start = 0; start < n - length; start++) {
				int end = start + length - 1;

//				System.out.print(printString(str, start, end) + " ");
				System.out.print(str.substring(start, end +1) + " ");
			}
		}

	}

	public static String printString(String str, int start, int end) {

		String result = "";
		while (start <= end) {

			result += str.charAt(start);
			start++;
		}

		return result;
	}

}
