package test01;

public class Car {
	private int speed;
	private String model;
	private String color;

	public Car(int s, String m, String c) {
		speed = s;
		model = m;
		color = c;
	}

	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
	}

	public void printCar() {
		System.out.println("속도:" + speed);
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
	}

}
