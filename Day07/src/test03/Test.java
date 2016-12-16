package test03;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2;
		
		c2 = c1;
		
		c1.speed = 100;
		c1.model = "¾Æ¿ìµð";
		
		System.out.println(c2.toString());
		
		c1 = null;
		c2 = null;
	}

}
