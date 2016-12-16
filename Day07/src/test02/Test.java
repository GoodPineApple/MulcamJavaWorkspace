package test02;

public class Test {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.speed = 100;
		myCar.model = "¼Ò³ªÅ¸";

		myCar.speedUp(20);
		myCar.speedUp(30);
		myCar.speedUp(50);

		String result = myCar.toString();
		System.out.println(result);
		
		myCar.speedDown();
		myCar.speedDown();
		
		for(int i = 0; i < 5; i++){
			myCar.speedDown();
		}
		
		result = myCar.toString();
		System.out.println(result);

	}

}
