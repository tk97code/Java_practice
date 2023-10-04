package Basic_OOP;
import java.lang.*;

public class ex01 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int max;
		
		max = Math.max(a, b);
		System.out.println("Max of a, b: " + max);
		max = Math.max(max, c);
		System.out.println("Max of a, b, c: " + max);

	}

}
