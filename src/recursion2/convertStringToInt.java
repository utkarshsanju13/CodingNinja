package recursion2;

public class convertStringToInt {

	public static void main(String[] args) {
		
		String str = "1234";
		System.out.println(convertStringToInt(str));
	}
	public static int convertStringToInt(String input){
		// Write your code here
        
        if(input.length() == 1)
            return Integer.parseInt(input);

        
        int sum = convertStringToInt(input.substring(1));
        
        int result = Integer.parseInt(String.valueOf(input.charAt(0))) * (int) Math.pow(10,input.length()-1);
        
        return sum + result;
	}
}
