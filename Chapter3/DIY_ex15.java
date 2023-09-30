public class DIY_ex15 {

	public static void main(String[] args) {
		int space_ = 7;
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < space_ - i; k++) {
				System.out.print("   ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for (int i = 2; i > -1; i--) {
			for (int k = 0; k < space_ - i; k++) {
				System.out.print("   ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
