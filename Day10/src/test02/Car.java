package test02;

public class Car {
	private int speed;
	private String color;
	private String model;
///////////////////////////////////////////////////////
	public Car(int s, String c, String m) {
		speed = s;
		color = c;
		model = m;
	}
	public Car(int s, String c) {
		
	}
	public Car() {
		this(0, "RED");
	}
///////////////////////////////////////////////////////
	public void speedUp(){
		speed += 10;
	}
	
	public void speedDown(){
		speed -= 10;
	}
	
	public String toString(){
		return "모델:" + model +", 색상:" + color + ", 현재속도:" +speed;
	}
	

}
