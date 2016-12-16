package test01;

public class Test {

	public static void main(String[] args) {
		
		Car c;
		c = new Car();
		//Car c = new Car();	
		
		c.speed = 100;
		c.mileage = 10000;
		c.model = "소나타";
		c.echo = true;
		
		c.printCarStatus();
		
		
		Car c2 = new Car();
		
		c2.speed = 200;
		c2.mileage = 0;
		c2.echo = false;
		c2.model = "모닝";
		
		c2.printCarStatus();
		
	}

}


// 객체마다 새로 생성되는 마치 부서마다 프린터를 나눠주듯이.
// 저장공간 효율을위해서 참조변수를 사용하는거 아닌가...