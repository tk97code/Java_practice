package Chapter4;

import java.util.*;

public class DIY_ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		int beginPos, endPos;
		System.out.println("Input string: ");
		str1 = sc.nextLine();
		System.out.println("Input begin position: ");
		beginPos = sc.nextInt();
		System.out.println("Input end position: ");
		endPos = sc.nextInt();
		
		System.out.println("Substring at (" + beginPos + ", " + endPos + "): " + str1.substring(beginPos, endPos));
	}

}
