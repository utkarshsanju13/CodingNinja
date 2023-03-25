package pattern;

public class patternTest1 {
	
	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		
//        Scanner sc = new Scanner(System.in);
        int n = 4;
        int times = 2*n + 1;
        
        for(int i = 0 ;i<n; i++){
            
//            for(int j = 0; j < times/2; j++){
//                
//                if( j == i){
//                    System.out.print("*");
//                }else{
//                    System.out.print("0");
//                }
//        }
//        System.out.print("*");
            
            for(int k = times/2 + 1; k < n; k++){
                
                if(k == n - i - 1){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }

            
     			System.out.println();
   
	}	
}

}



