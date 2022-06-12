package sajan;

public class fibonacciSeries {
	public static void main(String[] args) {
		int n = 8, firstNum = 0, secNum = 1;
		System.out.println("Fibonacci Series " + n + " terms:");
		for (int i = 1; i < n; ++i) {
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
			
		}
	}

}
