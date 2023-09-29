// 13
public class DIY_ex {

	public static void main(String[] args) {
		int space_ = 0;
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < space_; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < 10 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space_+=2;
		}
		for (int i = 2; i > -1; i--) {
			space_=i*2;
			for (int k = 0; k < space_; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < 10 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
