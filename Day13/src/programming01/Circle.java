package programming01;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}
