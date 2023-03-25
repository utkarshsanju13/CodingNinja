package recursion2;

/*Given an integer N, count and return the number of zeros that are present
		in the given integer using recursion.*/
		

/*Sample Input 2 :
00010204
Sample Output 2 :
2
Explanation for Sample Output 2 :
Even though "00010204" has 5 zeros, the output would still be
2 because when you convert it to an integer, it becomes 10204.*/

public class CountZero {

	public static void main(String[] args) {
		
		int i = 0102;
		
		int result = countZerosRec(i);
	}
	
	public static int countZerosRec(int input){
		// Write your code here
        
        if(input == 0){
            return 1;
        }
        
        if(input/10 == 0)
            return 0;
    
        int result = countZerosRec(input/10);
        
        if(input%10 == 0)
            return 1 + result;
        
        return result;
	}

}
