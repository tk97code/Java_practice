public class DIY_ex17 {
	public static void main(String[] args) {
		// 1 3 7 15 31 63 -> Rule: (n - 1) * 2 + 1
		int temp = 0;
		for (int n = 1; n <= 10; n++) {
			temp = temp*2 + 1;
			System.out.println(temp);
		}
	}
}
