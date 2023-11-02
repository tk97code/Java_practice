
package Chapter5;


class Point2D {
	private double x, y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void details() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
}

class Rectangle2D {
	private Point2D topleft;
	private double width, height;
	
	Rectangle2D() {
		this.topleft = new Point2D(0, 0);
		this.width = 0;
		this.height = 0;
	}
	Rectangle2D(Point2D topleft, double width, double height) {
		this.topleft = topleft;
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (width + height) * 2;
		return perimeter;
	}
	
	public void display() {
		System.out.println("Top left point: (" + topleft.getX() + ", " + topleft.getY() + ")");
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}


public class DIY_ex01 {

	public static void main(String[] args) {
		Point2D topleft = new Point2D();
		topleft.setX(20);
		topleft.setY(10);
		Rectangle2D rect = new Rectangle2D(topleft, 4, 5);
		rect.display();
	}

}
