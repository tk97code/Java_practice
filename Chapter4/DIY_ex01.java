package Chapter4;

import java.util.*;

public class DIY_ex01 {

	public static void smallest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("The smallest number is " + arr[0]);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}		
		smallest(arr);
		
	}

}

