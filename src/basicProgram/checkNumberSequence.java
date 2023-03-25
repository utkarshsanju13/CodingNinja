package basicProgram;

import java.util.Scanner;

//You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, �.., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
//Note : We say that x is strictly larger than y when x > y.
//So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.
//
//
//That is, in the sequence if numbers are decreasing, they can start increasing at one point. And once the sequence of numbers starts increasing, they cannot decrease at any point further.
//Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.
//
//
//You just need to print true/false. No need to split the sequence.
//Input format :
//Line 1 : Integer 'n'
//Line 2 and Onwards : 'n' integers on 'n' lines(single integer on each line)
//Output Format :
//"true" or "false" (without quotes)

public class checkNumberSequence {


	public static void main(String[] args) {
		// Write your code here
        
         Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        
	        
	        for (int i = 0 ; i < n; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        boolean isDec = true;
	        boolean result = true;
	        int prev = arr[0];
	        int j = 1;
	        
	        while(j <= n-1){
	            
	            int curr = arr[j];
	            
	            if(prev == curr){
	                result = false;
	                break;
	            }else if(curr < prev){
	                if(isDec == false){
	                    result = false;
	                    break;
	                }
	            }else{
	                	isDec = false;    
	                }  
	            
	            prev = curr;
	            j++;
	            }
	        
	        System.out.println(result);

	}

}
