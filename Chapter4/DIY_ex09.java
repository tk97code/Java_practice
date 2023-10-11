package Chapter4;

import java.util.*;

public class DIY_ex09 {

	
	public static int sz;
	public static Scanner sc = new Scanner(System.in);
	
	public static void setSize() {	
		System.out.print("Size of array: ");
		sz = sc.nextInt();
	}
	
	public static ArrayList<Integer> inputNumber() {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < sz; i++) {
			System.out.print("Input arr[" + (i+1) + "] : ");
			int n = sc.nextInt();
			arr.add(n);
		}
		System.out.println("================================");
		return arr;
	}
	
	public static ArrayList<Integer> multiplication(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		ArrayList<Integer> result_arr = new ArrayList<Integer>();
		for (int i = 0; i < sz; i++) {
			result_arr.add(arr1.get(i)*arr2.get(i));
		}
		return result_arr;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		setSize();
		arr1 = inputNumber();
		arr2 = inputNumber();
		
		System.out.println("arr1 = " + arr1);
		System.out.println("arr2 = " + arr2);
		System.out.println("Result = " + multiplication(arr1, arr2));
	}

}
