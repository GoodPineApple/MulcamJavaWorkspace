package test01;

public class Car {
	public int speed = 0;
	public String color = "WHITE";
	public String model = "SONATA";
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public String toString() {
		return "색상:" + color + ", 모델:" + model + ", 현재속도:" + speed;
	}

}
