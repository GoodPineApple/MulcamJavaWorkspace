package test01;

public class SportsCar extends Car {
	private boolean turbo;

	public SportsCar() {
		super(0, "SONATA", "RED");
		turbo = false;
	}

	public SportsCar(int s, String m, String c, boolean t) {
		super(s, m, c);
		turbo = t;
	}
	
	public void ChildMethod() {
		System.out.println("자식클래스가 추가한 매소드");
	}
	
	public void printCar() {
		super.printCar();
		System.out.println("터보모드:" + true);
	}
	

}
