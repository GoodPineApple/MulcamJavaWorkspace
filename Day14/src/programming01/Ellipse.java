package programming01;

public class Ellipse extends TwoDimshape {
	
	public Ellipse(int width, int height) {
		super(width, height);
	}
	
	public int getArea() {
		return (int)((getWidth()/2) * (getHeight()/2) * Math.PI);
	}
	
}
