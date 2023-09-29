// 14
public class DIY_ex14 {

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
	}

}
