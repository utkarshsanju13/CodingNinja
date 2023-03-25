package array2D;


/*For a given two-dimensional integer array/list of size (N x M),
you need to find out which row or column has the largest sum
(sum of all the elements in a row/column) amongst all the rows and columns.*/

public class largestRowAndColumn {

	public static void main(String[] args) {
		
		int arrr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		findLargest(arrr);
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
        
        if(maxRowSum >= maxColSum){
            
            System.out.println("row" + " "+ rowIndex + " " + maxRowSum);
        }else
            System.out.println("column"+ " "+ colIndex + " "  + maxColSum);
	}

}
