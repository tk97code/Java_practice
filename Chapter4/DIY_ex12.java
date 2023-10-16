package Chapter4;

import java.util.*;

public class DIY_ex12 {

	public static void inputNumber(ArrayList<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int sz = sc.nextInt();
		
		for (int i = 0; i < sz; i++) {
			System.out.print("Input arr[" + (i+1) + "] : ");
			int n = sc.nextInt();
			arr.add(n);
		}
	}
 	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		inputNumber(arr);
		System.out.println(arr);
		arr.sort(Comparator.naturalOrder());
		System.out.println("Min number of array is: " + arr.get(0));
		System.out.println("Min number of array is: " + arr.get(arr.size() - 1));
	}

}
