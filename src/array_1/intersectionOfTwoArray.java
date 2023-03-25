package array_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class intersectionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2, 6, 1, 2};
		int arr2[] = {1, 2, 3, 4, 2};
		
		intersections(arr1, arr2);
		System.out.println();
		intersectionNlogN(arr1, arr2);

	}
	
//	Using HashMap
//	Its has space complexity of O(n)
//	Time Complexity O(n)
	public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n1 = arr1.length;
        int n2 = arr2.length;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < n2; i++){
            
            if(!hm.containsKey(arr2[i])){
                hm.put(arr2[i],1);
            }else
                 hm.put(arr2[i], (hm.get(arr2[i])) + 1);
            
        }
        
        for(int i = 0 ; i < n1; i++){
            
            if(hm.containsKey(arr1[i]) && hm.get(arr1[i]) > 0 ){
                System.out.print(arr1[i]+" ");
                hm.put(arr1[i], hm.get(arr1[i]) - 1);

            }
        }
    }
	
//	Time Comlexity = O(nlogn) Due to Sorting 
	public static void intersectionNlogN(int[] arr1, int[] arr2) {
	    //Your code goes here
       Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0;
        int j = 0;
        
        while(i < arr1.length && j < arr2.length){
            
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j])
                i++;
            else
                j++;
        }
    }

}
