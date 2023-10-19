package Chapter4;

import java.util.*;

public class DIY_ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		System.out.println("Input given string: ");
		str1 = sc.nextLine();
		System.out.println("Input specified substring: ");
		str2 = sc.nextLine();
		
		if (str1.contains(str2)) {
			System.out.println("Given string contain specified substring");
		} else {
			System.out.println("Given string not contain specified substring");
		}

	}

}
