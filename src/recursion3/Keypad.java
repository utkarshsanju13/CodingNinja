package recursion3;

import java.util.HashMap;

public class Keypad {
	
	public static void main(String[] args) {
		int n = 23;
		String [] result = keypad(n);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static String[] keypad(int n) {
	
		if (n == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}

		String[] smallOutput = keypad(n / 10);
		int lastDigit = n % 10;
		String lastDiString = getOption(lastDigit);
		String[] output = new String[smallOutput.length * lastDiString.length()];

		int k = 0;
		for (int i = 0; i < smallOutput.length; i++) {
			for (int j = 0; j < lastDiString.length(); j++) {
				output[k] = smallOutput[i] + lastDiString.charAt(j);
				k++;
			}
		}

		return output;

	}

	public static String getOption(int n) {

		if (n == 2) {
			return "abc";
		}
		if (n == 3) {
			return "def";
		}
		if (n == 4) {
			return "ghi";
		}
		if (n == 5) {
			return "jkl";
		}
		if (n == 6) {
			return "mno";
		}
		if (n == 7) {
			return "pqrs";
		}
		if (n == 8) {
			return "tuv";
		}
		if (n == 9) {
			return "wxyz";
		}
		
		return "";
	}

}
