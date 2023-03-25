package array2D;

public class findLargest {

	public static void main(String[] args) {
		
		int arr[][] = new int[0][0];
		
		findLargest(arr);
	}
	
	public static void findLargest(int arr[][]){
		//Your code goes here
        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        
        
        
        for(int i = 0 ;i < arr.length; i++){
            
            int rowSum = 0;
            for(int j = 0 ; j < arr[i].length; j++){
                
                rowSum+= arr[i][j];
            }
            
            if(maxRowSum < rowSum){
                maxRowSum = rowSum;
                rowIndex = i;
            }
        }
       
        
        for(int i = 0; arr.length != 0 && i < arr[0].length; i++){
            
            int colSum = 0;
            for(int j = 0; j < arr.length; j++){
                
                colSum+=arr[j][i];
            }
            
            if(maxColSum < colSum){
                maxColSum = colSum;
                colIndex = i;
            }
        }
        
        System.out.println("===============");
        if(maxRowSum >= maxColSum){
            
            System.out.println("row" + " "+ rowIndex + " " + maxRowSum);
        }else
            System.out.println("column"+ " "+ colIndex + " "  + maxColSum);
	}
}
