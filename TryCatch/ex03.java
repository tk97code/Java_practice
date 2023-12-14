package TryCatch;

import java.util.Scanner;

class checkException extends Exception {
	public checkException(String message) {
		super(message);
	}
}

public class ex03 {
	private static String id, name;
	private static int age;
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void inputInfo() throws checkException {
		System.out.print("Input ID: ");
		id = sc.next();
		
		if (id.length() != 6) 
			throw new checkException("Not valid ID");
		
		System.out.print("Input Name: ");
		name = sc.nextLine();
		if (checkName(name) < 2)
			throw new checkException("Not valid Name");
		
		System.out.print("Input Age: ");
		age = sc.nextInt();
		if (age < 19)
			throw new checkException("Not valid Age");
	}
	
	public static int checkName(String name) {
        String[] words = name.split("\\s+");

        return words.length;
	}
	
	public static void main(String[] args) {
		try	{
			inputInfo();
		} catch (checkException e) {
			System.out.println(e.getMessage());
		}
	}

}
