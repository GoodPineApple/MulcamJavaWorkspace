package test03;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	private static int numOfCars=0;
	
	public static int gerNumOfCars() {
		return numOfCars;
	}
///////////////////////////////////////////////////////
	public Car() {
		this(0,"WHITE","SONATA");
	}
	public Car(int s, String c, String m) {
		speed = s;
		color = c;
		model = m;
		numOfCars++;
	}


}
