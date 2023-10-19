package Chapter4;

import java.util.*;

public class DIY_ex17 {

	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Str1: ");
		str1 =sc.nextLine();
		System.out.println("Str2: ");
		str2 =sc.nextLine();
        int comparison = str1.compareTo(str2);

        if (comparison < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (comparison > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal");
        }
		
	}

}
