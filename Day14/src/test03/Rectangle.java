package test03;

public class Rectangle extends Shape{
	
	private int width, height;
	public Rectangle(int x, int y, int w, int h) {
		super(x,y);
		this.width=w;
		this.height=h;
	}
	public Rectangle(int w, int h) {
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
