package programming01;

public class Triangle extends TwoDimshape {
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	public int getArea() {
		return (width * height) / 2;
	}
	
}
