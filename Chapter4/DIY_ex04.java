package Chapter4;

import java.util.*;

public class DIY_ex04 {
	
	public static int SumOfDigits(int n) {
		int sum = 0;
		int temp = n;
		while(n > 0) {
			sum  += n % 10;
			n = n / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n = ");
		
		int n = sc.nextInt();
		System.out.println("Sum of digits in " + n + " is " + SumOfDigits(n));
	}

}
