package array2D;

public class spiralPrint {

	public static void main(String[] args) {
		
		int arrr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		spiralPrint(arrr);
	}
	
	public static void spiralPrint(int arr[][]){
		//Your code goes here
     
        if(arr.length <= 0)
            return;
        int left = 0;
        int right = arr[0].length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        int count = arr.length * arr[0].length;
        
        while(count >=1){
            
            for(int i = left; i <= right && count >=1; i++){
                System.out.print(arr[top][i]+" ");
                count--;
            }
            top++;
           
            
            for(int i = top; i <= bottom && count >=1; i++){
                System.out.print(arr[i][right]+ " ");
                count--;
            }
            right--;
            
         
            
            for(int i = right; i >= left && count >=1; i--){
                System.out.print(arr[bottom][i]+ " ");
                count--;
            }
            bottom--;
            
            for(int i = bottom; i >= top && count >=1; i--){
                System.out.print(arr[i][left]+ " ");
                count--;
            }
            left++;
        }
        
        
        
	}

}
