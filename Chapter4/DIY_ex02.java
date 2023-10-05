package Chapter4;

import java.util.*;

public class DIY_ex02 {

	public static int Vowels(String s) {
		// Vowels: nguyen am
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('u', 'e', 'o', 'a', 'i'));
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (vowels.contains(s.charAt(i))) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Input String: ");
		String s = k.nextLine();
		
		System.out.println("Number vowels of this string is: "+Vowels(s));
		
	}

}
