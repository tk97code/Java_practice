// 10
public class DIY_ex10 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 101; i+=7) {
			sum += i;
		}
		System.out.println("Sum of number divisor 7 from 1 to 100 is: " + sum);
	}
}
