package Chapter5;

import java.awt.Color;
import java.util.*;

class Mobile {
	private String ownerName;
	private Color color;
	private String number;
	private String model;
	
	Mobile() {
		ownerName = null;
		color = null;
		number = null;
		model = null;
	}
	
	Mobile(String ownerName, Color color, String number, String model) {
		this.ownerName = ownerName;
		this.color = color;
		this.number = number;
		this.model = model;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public String toString() {
		String[] arr = new String[4];
		arr[0] = ownerName;
		String c = "("+color.getRed() + ", " + color.getGreen() + ", " + color.getBlue()+")";
		arr[1] = c;
		arr[2] = number;
		arr[3] = model;
		return Arrays.toString(arr);
	}
	
}

public class DIY_ex03 {
	
	public static void main(String[] args) {
		Mobile phone1 = new Mobile("David", Color.black, "01223541233", "Iphone 15");
		System.out.println(phone1.toString());
		Mobile phone2 = new Mobile();
		phone2.setOwnerName("Linda");
		phone2.setColor(Color.blue);
		phone2.setNumber("12315236234");
		phone2.setModel("Samsung S23+");
		System.out.println(phone2.toString());
	}
	
}
