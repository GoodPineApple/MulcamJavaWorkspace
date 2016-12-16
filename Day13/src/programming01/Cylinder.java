package programming01;

public class Cylinder extends Circle {
	private double height;
	
	Cylinder() {	}
	Cylinder(double radius) {
		super();
	}
	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}

}
