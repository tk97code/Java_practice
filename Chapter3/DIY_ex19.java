public class DIY_ex19 {

	public static void main(String[] args) {
		// 1 3 9 27 81 243 -> Rule: (n - 1) * 3
		int temp = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(temp);
			temp *= 3;
		}

	}

}
