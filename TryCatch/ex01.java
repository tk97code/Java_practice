package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {

	public static double divide(double a, double b) throws ArithmeticException {
		double c = a / b;
		if (b == 0)
			throw new ArithmeticException("not divide for 0");
		return c;
	}
	
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		try {
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println(divide(a, b));
			
		} catch (InputMismatchException e) {
			System.out.println("Input not a number");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
