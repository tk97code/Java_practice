public class DIY_ex20 {

	public static void main(String[] args) {
		long number, result;
		number = 6;
		result = factorial(number);
		System.out.println("The factorial of 6 is: " + result);
	}
		
	public static long factorial(long value) {
		long result = 1;
			
		// missing lines
		for (int i = 1; i <= 6; i++) {
			result *= i;
		}
			
		return result;
	}

}
