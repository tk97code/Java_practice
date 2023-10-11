package Chapter4;

import java.util.*;

public class DIY_ex10 {

	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	
	// Check string start with specified word
	public static void checkString(String s, String specified) {
		boolean isStart = s.startsWith(specified);
		if (isStart)
			System.out.println("\"" + s + "\" starts with " + "\"" + specified + "\"");
		else 
			System.out.println("\"" + s + "\" don't start with " + "\"" + specified + "\"");
	}
	
	public static void main(String[] args) {
		System.out.println("Input specified word: ");
		String specified = inputString();
		System.out.println("Input String: ");
		String str = inputString();
		
		checkString(str, specified);
	}

}
