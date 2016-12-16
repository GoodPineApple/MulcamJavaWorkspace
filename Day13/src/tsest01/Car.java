package tsest01;

public class Car {
	public int speed;
	public String color;
	public String model;
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public void printCar() {
		System.out.println("속도:" + speed);
		System.out.println("색상:" + color);
		System.out.println("모델:" + model);
	}

}
