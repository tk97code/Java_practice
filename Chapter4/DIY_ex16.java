package Chapter4;

import java.util.*;

class ArrayConverter {
	private int[] arr;
	private ArrayList<Integer> arrList;
	
	
	ArrayConverter(int[] arr) {
		this.arr = arr;
	}
	
	ArrayConverter() {
	}
	
	public void input() {
		int sz = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		sz = sc.nextInt();
		this.arr = new int[sz];
		
		for (int i = 0; i < sz; i++) {
			System.out.print("Arr[" + (i + 1) + "]: ");
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void convert() {
		this.arrList = new ArrayList<Integer>();
		for (int x: this.arr) {
			this.arrList.add(x);
		}
		
	}
	
	public void show() {
		System.out.println("Converted ArrayList: " + this.arrList);
	}
}

public class DIY_ex16 {

	public static void main(String[] args) {
		ArrayConverter arr = new ArrayConverter();
		arr.input();
		arr.convert();
		arr.show();
	}

}
