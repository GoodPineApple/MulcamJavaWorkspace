package test02;

public class SportsCar extends Car {
	private boolean isTurbo;
	
	@Override
	public void printCar() {
		super.printCar();
		System.out.println("터브모드:" + isTurbo);
		
	}
	

}
