package tsest01;

public class SportsCar extends Car{
	public boolean isTurbo;
	
	public void printCar() {
//		System.out.println("�ӵ�:" + speed);
//		System.out.println("����:" + color);
//		System.out.println("��:" + model);
		super.printCar();
		System.out.println("�ͺ���:" + isTurbo);
	}

}
