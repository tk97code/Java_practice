package chapter2_OOP_BASIC;

class Student {
	private String name, address;
	private int age;
	private double math, literature, english, biology, history, geography;
	
	Student(String name, String address, int age, double math, double literature, double english, double biology, double history, double geography) {
		this.name =  name;
		this.address = address;
		this.age = age;
		this.math = math;
		this.literature = literature;
		this.english = english;
		this.biology = biology;
		this.history = history;
		this.geography = geography;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setMark(double math, double literature, double english, double biology, double history, double geography) {
		this.math = math;
		this.literature = literature;
		this.english = english;
		this.biology = biology;
		this.history = history;
		this.geography = geography;
	}
	
	double[] getMark() {
		double[] mark = {this.math, this.literature, this.english, this.biology, this.history, this.geography};
		return mark;
	}
	
	double avg_mark() {
		double sum = 0;
		for (double i : getMark()) {
			sum += i;
		}
		return (sum / 6);
		
	}
	
	void information() {
		System.out.println("____________________________");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println("Math: " + this.math);
		System.out.println("Literature: " + this.literature);
		System.out.println("English: " + this.english);
		System.out.println("Biology: " + this.biology);
		System.out.println("History: " + this.history);
		System.out.println("Geography: " + this.geography);
		System.out.printf("Average mark: %.2f \n", avg_mark());
	}
	
}

public class DIY_ex05 {

	public static void main(String[] args) {
		Student s1 = new Student("Kien", "VKU", 18, 9, 8, 6, 9.6, 8.6, 8.4);
		Student s2 = new Student("Teo", "VKU", 18, 4, 9, 10, 9.6, 9.7, 8.4);
		s1.information();
		s2.information();
		
	}

}
