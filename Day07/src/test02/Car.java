package test02;

public class Car {
	int speed;
	String model;

	public void speedUp(int s) {
		speed += s;
	}

	public void speedDown() {
		speed -= 10;
	}

	public String toString() {
		return "�ӵ�:" + speed + ",��:" + model;
	}

}
