package programming01;

public class TwoDimshape extends Shape {
	
	public TwoDimshape(int width, int height) {
		super(width, height);
	}

	public int getArea() {
		return getWidth() * getHeight();
	}

}
