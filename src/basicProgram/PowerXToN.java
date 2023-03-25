package basicProgram;

//Complexity is log(N)
public class PowerXToN {

	public static void main(String[] args) {
		 int x = 3;
		 int n = 5;
		 
		 System.out.println(power(x,n));
	}

	private static int power(int x, int n) {
		
		int temp;
		if(n == 0)
			return 1;
		temp = power(x, n/2);
		
		if(n % 2 == 0) {
			return temp * temp;	
		}else {
			return x*temp*temp;
		}
	}
	
}
