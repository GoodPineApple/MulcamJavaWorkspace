package test06;

public class Test {
	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.turnOn();
		System.out.println(myLamp);
		
		myLamp.turnOff();
		System.out.println(myLamp);
		
		System.out.println(myLamp.toString());
	}

}
