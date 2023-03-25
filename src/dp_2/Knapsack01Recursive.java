package dp_2;

public class Knapsack01Recursive {
	
	public static int knapsack(int maxWeight,int w[], int val[], int i) {
		
		if(i == w.length)
			return 0;
		
		int ans;
		if(w[i] <= maxWeight) {
			//including W[i]
			int ans1 = val[i] + knapsack(maxWeight-w[i],w,val,i+1);
			//excluding W[i]
			int ans2 = knapsack(maxWeight, w, val, i+1);
			ans = Math.max(ans1, ans2);
		}else {
			ans = knapsack(maxWeight, w, val, i+1);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
//		int w[] = {1, 2, 4, 5};
//		int val[] = {5, 4, 8, 6};
//		int maxW = 5;
	
		int w[] = {12, 7, 11, 8, 9};
		int val[] = {24, 13, 23, 15, 16};
		int maxW = 26;
		System.out.println(knapsack(maxW, w, val, 0));
	}

}
