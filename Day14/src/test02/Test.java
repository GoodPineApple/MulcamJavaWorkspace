package test02;

public class Test {

	public static void main(String[] args) {
		// Rectangle r = new Rectangle(10, 20);
		// Circle c = new Circle(10);
		// Triangle t = new Triangle(10, 20);
		//
		// System.out.println(r.getArea());
		// System.out.println(c.getArea());
		// System.out.println(t.getArea());
		/////////////////////////////////////////////////////////////////////

//		Shape s = new Circle(10);
//		System.out.println(s.getArea()); // 자동으로 오버라이드된 자식메소드 사용

		/////////////////////////////////////////////////////////////////////

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20);
		shapes[1] = new Triangle(10, 20);
		shapes[2] = new Circle(10);

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}

	}

}
