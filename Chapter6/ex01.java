package Chapter6;

abstract class Shape {
	abstract double area();
	abstract double perimeter();
	abstract void draw();
}

class Square extends Shape {
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	double area() {
        return side * side;
    }
	
	@Override
	double perimeter() {
		return side * 4;
	}
	
	@Override
	void draw() {
		System.out.println("Drawing a square \nSide of square is " + side);
	}
}

class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double area() {
        return Math.PI * radius * radius;
    }
	
	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	void draw() {
		System.out.println("Drawing a circle \nRadius of circle is " + radius);
	}
}

class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    double perimeter() {
        return 3 * side;
    }

    @Override
    void draw() {
    	System.out.println("Drawing a equilateral triangle \nSide of equilateral triangleis " + side);
    }
}

public class ex01 {

	public static void main(String[] args) {
		Square square = new Square(5);
        Circle circle = new Circle(3);
        EquilateralTriangle eTriangle = new EquilateralTriangle(4);

        square.draw();
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("_____________________________________________");

        circle.draw();
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("_____________________________________________");

        eTriangle.draw();
        System.out.println("Equilateral Triangle Area: " + eTriangle.area());
        System.out.println("Equilateral Triangle Perimeter: " + eTriangle.perimeter());
        System.out.println("_____________________________________________");
	}

}
