package test04;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(calcArea(new Rectangle(10,20)));
		
		System.out.println(calcArea(new Circle(10)));
		
		System.out.println(calcArea(new Triangle(10, 20)));

	}
	
	public static double calcArea(Shape s){
		return s.getArea();
	}

}
