package lab;

public class BoxtTest {
	public static void main(String[] args) {
		Box Box1;
		Box1 = new Box();
		
		Box1.setWidth(100);
		Box1.setLength(100);
		Box1.setHeight(100);
		
		System.out.println(Box1.getVolume());
		
		Box Box2 = new Box();
		
		Box2.setWidth(200);
		Box2.setLength(200);
		Box2.setHeight(200);
		
		Box1 = Box2;
		
		System.out.println(Box1.getVolume());
		
		
		
	}

}
