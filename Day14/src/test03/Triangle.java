package test03;

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
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

}
