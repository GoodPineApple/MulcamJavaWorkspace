package programming01;

public class ThreeDimshape extends Shape {
	
	protected int length;
	
	public ThreeDimshape (int width, int height, int length) {
		super(width, height);
		this.length = length;
	}
	
	public int getVolume() {
		return getWidth() * getHeight() * length;
	}


}
