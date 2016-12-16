package programming01;

public class Cube extends ThreeDimshape {

	public Cube (int width, int height, int length) {
		super(width, height, length);
	}
	
	public int getVolume() {
		return (int)(width * height * length) ;
	}
}
