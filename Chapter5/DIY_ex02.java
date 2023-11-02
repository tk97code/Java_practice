package Chapter5;

import java.awt.Color;

class Circle2D {
	
	private Point2D center;
	private double radius;
	private Color color;
	
	Circle2D() {
		center = new Point2D();
		center.setX(0);
		center.setY(0);
		this.radius = 0;
		this.color = Color.white;
	}
	public double getRadius() {
		return radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Point2D getCenter() {
		return center;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setCenter(Point2D center) {
		this.center = center;
	}
	
	public void display() {
		System.out.println("Center of circle: " + getCenter().getX() + ", " + getCenter().getY());
		System.out.println("Radius of circle: " + getRadius());
		System.out.println("Color of circle: " + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue());
	}
}

public class DIY_ex02 {

	public static void main(String[] args) {
		Point2D center = new Point2D(20, 10);
		Circle2D circle = new Circle2D();
		circle.setCenter(center);
		circle.setRadius(4);
		circle.setColor(Color.green);
		circle.display();
	}

}
