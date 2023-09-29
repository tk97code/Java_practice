// 09
public class DIY_ex04 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 100; i > 0; i--) {
			if (i % 7 == 0)
				if (i > max) max = i;
		}
		System.out.println("Biggest number divisor 7 from 1 to 100 is: " + max);
	}
}
