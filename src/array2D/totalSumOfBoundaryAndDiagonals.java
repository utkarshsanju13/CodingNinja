package array2D;

public class totalSumOfBoundaryAndDiagonals {

	public static void main(String[] args) {
		
		int arrr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		totalSum(arrr);
	}
	
	public static void totalSum(int[][] arr) {
		//Your code goes here
        int n = arr.length;
        int sum = 0;
        
        for(int i = 1; i < n - 1; i++){
            
            sum+=arr[i][0];
            sum+=arr[0][i];
            sum+=arr[n-1][i];
            sum+=arr[i][n-1];
        }
        
        for(int i = 0; i < n; i++){
            
            sum+=arr[i][i];
        }
        
        for(int i = 0 ; i < n; i++){
            
            sum+=arr[i][n-1-i];
        }
        
        if(n % 2 != 0){
            
            int middle = n/2;
            sum-=arr[middle][middle];
        }
        
        System.out.println(sum);

	}


}
