package test01;

public class Test {

	public static void main(String[] args) {
		Car c = new SportsCar();
		
		((SportsCar)c).ChildMethod();
		((SportsCar)c).ChildMethod();
		
		c.printCar();
		
		
	}

}
