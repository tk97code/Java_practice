package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class DIY_ex07 {

	public static ArrayList<Integer> arr = new ArrayList<>();

	public static void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int sz = sc.nextInt();

		for (int i = 0; i < sz; i++) {
			System.out.print("Input arr[" + (i+1) + "] : ");
			int n = sc.nextInt();
			arr.add(n);
		}
	}
	
	public static void checkSame() {
		if (arr.size() < 2) 
			System.out.println("Array not valid");
		else if (arr.get(0) == arr.get(arr.size() - 1))
			System.out.println("The first element is same as the last one");
		else 
			System.out.println("The first element is not same as the last one");
	}

	public static void main(String[] args) {
		inputNumber();
		checkSame();
	}

}
