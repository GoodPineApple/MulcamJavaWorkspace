package test01;

public class Car {
	String model;
	int speed;
	int mileage;
	boolean echo;
	
	void printCarStatus(){
		System.out.println("---현재 차량정보---");
		System.out.println("모델 : " + model);
		System.out.println("속도 : " + speed);
		System.out.println("주행거리 : " + mileage);
		System.out.println("에코모드 : " + echo);
	}
	
	

}
