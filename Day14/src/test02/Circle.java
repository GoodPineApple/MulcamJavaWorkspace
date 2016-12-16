package test02;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int x, int y, int r){
		super(x,y);
		radius = r;
	}
	public Circle(int r) {
		super();
		radius = r;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
