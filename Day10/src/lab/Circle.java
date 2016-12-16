package lab;

public class Circle {
	private double radius;
	public static final double PI = 3.141592;
	
	public static double getPI() {
		return PI;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	private double square() {
		return radius * radius;
	}
	
	public double getArea() {
		return square() * PI;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * PI * radius;
		return perimeter;
	}
	
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		myCircle.square();    //객체를 생성하지 않았기 때문에.
		getPI();
		
	}
	
}
