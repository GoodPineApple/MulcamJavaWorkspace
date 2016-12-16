package test05;

public class Car {
	private int speed;
	private String model;
	private String color;

///////////////////////////////////////////////////////////////////
	public Car(int speed, String moedl, String color) {
		this.speed = speed;
		this.model = model;
		this.color = color;
	}

///////////////////////////////////////////////////////////////////
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	///////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "¼Óµµ:" + speed + "¸ðµ¨:" + model + "Ä®¶ó:" + color;
	}

}
