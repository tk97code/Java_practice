package Basic_OOP;

import java.util.Calendar;

public class ex03 {

	public static void main(String[] args) {
		Calendar rightnow = Calendar.getInstance();
		System.out.println(rightnow.getTime());
		System.out.println(rightnow.getTimeZone());
		System.out.println(rightnow.getWeekYear());
	}

}
