package test03;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10, 20);
		System.out.println(calcArea(r));
		
		Triangle t = new Triangle(10, 20);
		System.out.println(calcArea(t));
		
		System.out.println(calcArea(new Triangle(10, 20)));
		
//		Circle c = new Circle(10);
//		System.out.println(calcArea(c));
		
		System.out.println(calcArea(new Circle(10)));  // 이렇게도 가능
		
	}
	
	
	 
	public static double calcArea(Shape s) {    // 이 부분이 중요
		double result = 0;
		
		if(s instanceof Rectangle) {
			result = ((Rectangle)s).getWidth() * ((Rectangle)s).getHeight();
		} else if(s instanceof Circle) {
			Circle cir = (Circle) s;
			result = cir.getRadius() * cir.getRadius() * 3.14;
		} else if(s instanceof Triangle) {
			Triangle tri = (Triangle) s;
			result = tri.getWidth() * tri.getWidth() / 2;
		}
		
		return result;
	}

}
