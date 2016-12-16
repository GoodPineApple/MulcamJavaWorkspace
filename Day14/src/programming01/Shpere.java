package programming01;

public class Shpere extends ThreeDimshape {
	
	public Shpere (int width, int height, int length) {
		super(width, height, length);
	}
	
	public int getVolume() {
		return (int)(4 * (width/2) * (height/2) * (length/2) * Math.PI)/3;
	}
	
}
