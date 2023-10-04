package Chapter3;

public class DIY_ex18 {

	public static void main(String[] args) {
		// 1 7 16 37 79 173 -> Rule:
		double s = 0;
		for (int i = 1; i <= 10; i++) {
			s = 1+6*(i-1)+1.5*(i-1)*(i-2)+1.5*(i-1)*(i-2)*(i-3)+(double)11/60*(i-1)*(i-2)*(i-3)*(i-4)*(i-5);
			System.out.println(s);
		}

	}

}
