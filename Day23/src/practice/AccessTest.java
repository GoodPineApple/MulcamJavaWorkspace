package practice;

public class AccessTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1);
		System.out.println(c2); //static이 있어도 객체가 다르기에 값은 변하지 않는다.
	}

}
