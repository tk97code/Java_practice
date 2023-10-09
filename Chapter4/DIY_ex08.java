package Chapter4;

import java.util.*;

public class DIY_ex08 {
	
	public static ArrayList<Integer> oriArr = new ArrayList<Integer>();
	public static ArrayList<Integer> swapArr = new ArrayList<Integer>();

	public static void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int sz = sc.nextInt();
		
		for (int i = 0; i < sz; i++) {
			System.out.print("Input arr[" + (i+1) + "] : ");
			int n = sc.nextInt();
			oriArr.add(n);
		}
	}
	
	public static void swapFirstAndLast() {
		swapArr.addAll(oriArr);
		
		if (oriArr.size() > 1) {
			int firstElement = oriArr.get(0);
			int lastElement = oriArr.get(oriArr.size() - 1);
			
			swapArr.set(0, lastElement);
			swapArr.set(oriArr.size() - 1, firstElement);
		}
	}
	
	public static ArrayList<Integer> getOriArr() {
		return oriArr;
	}
	
	public static ArrayList<Integer> getSwapArr() {
		return swapArr;
	}
	
	public static void main(String[] args) {
		inputNumber();
		System.out.println("Original Array: " + getOriArr());
		swapFirstAndLast();
		System.out.println("Swapped Array: " + getSwapArr());
	}

}
