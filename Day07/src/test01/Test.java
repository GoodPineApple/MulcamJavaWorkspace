package test01;

public class Test {

	public static void main(String[] args) {
		
		Car c;
		c = new Car();
		//Car c = new Car();	
		
		c.speed = 100;
		c.mileage = 10000;
		c.model = "�ҳ�Ÿ";
		c.echo = true;
		
		c.printCarStatus();
		
		
		Car c2 = new Car();
		
		c2.speed = 200;
		c2.mileage = 0;
		c2.echo = false;
		c2.model = "���";
		
		c2.printCarStatus();
		
	}

}


// ��ü���� ���� �����Ǵ� ��ġ �μ����� �����͸� �����ֵ���.
// ������� ȿ�������ؼ� ���������� ����ϴ°� �ƴѰ�...