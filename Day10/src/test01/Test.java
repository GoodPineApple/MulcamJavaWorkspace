package test01;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(100,"RED","BMW520");
		

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
