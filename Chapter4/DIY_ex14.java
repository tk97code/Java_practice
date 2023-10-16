package Chapter4;

import java.util.*;

public class DIY_ex14 {
		
	public static ArrayList<String> inputNumber(ArrayList<String> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int sz = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < sz; i++) {
			System.out.print("Input arr[" + (i+1) + "] : ");
			String s = sc.nextLine();
			arr.add(s);
		}
		return arr;
	}
	
	public static ArrayList<String> commonElement(ArrayList<String> arr1, ArrayList<String> arr2) {
		ArrayList<String> commonArr = new ArrayList<String>();
		for (String s : arr1) {
			if (arr2.contains(s)) {
				commonArr.add(s);
			}
		}
		
		return commonArr;
	}
	
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		arr1 = inputNumber(arr1);
		arr2 = inputNumber(arr2);
		
		System.out.println("Arr1: " + arr1);
		System.out.println("Arr2: " + arr2);
		System.out.println("Common element is: " + commonElement(arr1, arr2));
	}
	
}
