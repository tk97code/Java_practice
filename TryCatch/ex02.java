package TryCatch;

import java.util.Scanner;

class myException extends Exception {
	private int exitIndex = 0;
	
	public myException(String message, int exitIndex) {
		super(message);
		this.exitIndex = exitIndex;
	}
	
	public int getExitIndex() {
		return exitIndex;
	}
}

public class ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void printArr(int[] arr, int length) {
		for (int i = 0 ; i <= length -1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void inputArr(int[] arr) throws myException {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input arr[" + i + "] = ");
			int a = sc.nextInt();
			if (a == 100) {
				throw new myException("you input 100", i);
			}
			arr[i] = a;
		}
	}
	
	public static void main(String[] args) {
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		try {
			inputArr(arr);
		} catch(myException e) {
			System.out.println(e.getMessage());
			printArr(arr, e.getExitIndex());
		}
	}

}
