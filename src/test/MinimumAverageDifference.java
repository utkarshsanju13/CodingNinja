package test;

public class MinimumAverageDifference {

	public static void main(String[] args) {
		
		int []nums = {2,5,3,9,5,3};
		
		System.out.println(minimumAverageDifference(nums));
	}
	
	 public static int minimumAverageDifference(int[] nums) {
		    
	        if(nums.length == 1)
	            if(nums[0] == 0)
	                return 0;
	        
	        int allSum = 0;
	        
	        for(int i = 0 ; i < nums.length; i++){
	            allSum+=nums[i];
	        }
	        
	        int minAbsoluteDiff = Integer.MAX_VALUE;
	        int firstSum = 0;
	        int index = 0;
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            firstSum = firstSum + nums[i];
	            int restSum = allSum - firstSum;
	            
	            int firstAvg = firstSum / (i + 1);
	            int lastAvg  =  restSum / (nums.length - i + 1);
	            
	            int value = Math.abs(firstAvg - lastAvg);
	            
//	            System.out.println("index = " + index + " " + "minAbsoluteDiff = " + minAbsoluteDiff);
	            
	            if(value <= minAbsoluteDiff){
	                index = i;
	                minAbsoluteDiff = value;        
	            }
	        }
	        
	        return index;
	    }
}
