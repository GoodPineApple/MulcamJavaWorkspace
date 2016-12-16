package test01;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "RED";
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println(c.toString());
		
		Car c2 = new Car();
		c2.color = "BLUE";
		System.out.println(c2.toString());
		
}
}
