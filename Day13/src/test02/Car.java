package test02;

public class Car {
	protected int speed;
	protected String color;
	protected String model;

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	
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
