package Chapter4;

import java.util.*;

public class DIY_ex01 {

	public static int smallest(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}		
		System.out.println("Smallest number of " + Arrays.toString(arr) + " is " + smallest(arr));
		
	}

}
