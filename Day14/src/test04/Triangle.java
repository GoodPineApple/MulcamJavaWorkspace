package test04;

public class Triangle extends Shape{

	private int width, height;
	public Triangle(int x, int y, int w, int h) {
		super(x,y);
		this.width=w;
		this.height=h;
	}
	public Triangle(int w, int h) {
		super();
		this.width = w;
		this.height  = h;
	}
	@Override
	public double getArea() {
		return width * height / 2;
	}

}
