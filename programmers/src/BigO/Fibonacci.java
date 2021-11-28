package BigO;

public class Fibonacci {
	
	public static int fibo(int n, int[] r) {
		
		if (n<= 0) return 0;
		else if (n == 1) return r[n]= 1;
		else if (r[n] > 0) return r[n];
		return r[n] = fibo(n-2, r)+fibo(n-1, r);
	}
	
	public static void main(String[] args) {
		 
		
		int[] r = new int[8];
		System.out.println(fibo(7, r));
		
	}
}
