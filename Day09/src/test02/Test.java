package test02;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
//		c.speed = 100;
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println(c.toString());
		
		c.setcolor("RED");
		System.out.println("c ��ü�� ����" + c.getcolor());
	}

}
