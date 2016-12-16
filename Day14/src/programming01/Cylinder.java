package programming01;

public class Cylinder extends ThreeDimshape {
	
	public Cylinder (int width, int height, int length) {
		super(width, height, length);
	}
	
	@Override
	public int getVolume() {
		return (int)((width/2) * (height/2) * Math.PI) * length ;
	}

}
