package Chapter4;

import java.util.*;

class Factorial {
	ArrayList<Long> fArr = new ArrayList<>();
	
	public void storeFactorial() {
		for (int i = 1; i <= 10; i++) {
			long f = calFatorial(i);
			fArr.add(f);
		}
		
	}
	
	public void reverseFactorial() {
		for (int i = fArr.size() - 1; i >= 0; i--) {
			System.out.println(fArr.get(i));
		}
	}
	
	private long calFatorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	
}

public class DIY_ex05 {	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		fact.storeFactorial();
		fact.reverseFactorial();
	}

}
