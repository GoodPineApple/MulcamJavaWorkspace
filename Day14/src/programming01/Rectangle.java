package programming01;

public class Rectangle extends TwoDimshape {
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	public int getArea() {
		return (int) (width * height);
	}
	
}
