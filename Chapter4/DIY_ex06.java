package Chapter4;

import java.util.*;

public class DIY_ex06 {
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
	
	public static ArrayList<Integer> descending() {
		Collections.sort(arr, Comparator.reverseOrder());
		return arr;
	}	
	
	public static void main(String[] args) {
		inputNumber();
		System.out.println("Descending order: "+descending().toString());
	}

}
