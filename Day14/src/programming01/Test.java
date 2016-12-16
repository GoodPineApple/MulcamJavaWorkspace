package programming01;

public class Test {
	public static void main(String[] args) {

		Shape[] shapes = new Shape[6];
		shapes[0] = new Rectangle(5, 10);
		shapes[1] = new Triangle(5, 10);
		shapes[2] = new Ellipse(5, 10);
		shapes[3] = new Shpere(10, 20, 20);
		shapes[4] = new Cube(10, 20, 20);
		shapes[5] = new Cylinder(10, 20, 20);

		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] instanceof TwoDimshape) {
				System.out.println(shapes[i].getArea());
			} else 	System.out.println(shapes[i].getVolume());
		}
	}

}
