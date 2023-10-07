package Chapter4;

import java.util.Scanner;

public class DIY_ex03 {
	public static int CountWord(String str) {
		int count = 0;
		String[] str_arr = str.split(" ");
		
		// Empty string
		if (str == null || str.isEmpty())
			return 0;
		
		count = str_arr.length;
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		System.out.println("Number of words in String: " + CountWord(str));
	}
}
