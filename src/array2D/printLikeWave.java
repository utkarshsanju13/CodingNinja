package array2D;

public class printLikeWave {

	public static void main(String[] args) {
		
		int arrr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		wavePrint(arrr);
	}
	
	public static void wavePrint(int arr[][]){
		//Your code goes here
        
        int row = arr.length;
        int col = 0;
        if(row > 0)
             col = arr[0].length;
        
        boolean down = true;
        for(int j = 0; j < col; j++){
            
            for(int i = 0 ; i < row; i++){
                
                if(down){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(arr[row-1-i][j] + " ");
                }   
            }
            
            down = !down;
        }
	}

}
