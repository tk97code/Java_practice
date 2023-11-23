package Chapter6;

interface Animals {
	void makeSound();
	void eat();
	void sleep();
	void go();
}

class Dog implements Animals {
	
	@Override
	public void makeSound() {
		System.out.println("Gau! Gau!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	@Override
	public void go() {
		System.out.println("Dog is going");
	}
	
}

class Cat implements Animals {
	
	@Override
	public void makeSound() {
		System.out.println("Meo! Meo!");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
	}
	
	@Override
	public void go() {
		System.out.println("Cat is going");
	}
	
}

public class ex02 {

	public static void main(String[] args) {
		Dog spike = new Dog();
		Cat tom = new Cat();
		
		spike.go();
		spike.makeSound();
		spike.eat();
		spike.sleep();
		
		tom.go();
		tom.makeSound();
		tom.eat();
		tom.sleep();
	}

}
