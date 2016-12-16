package programming01;

public class Test {

	public static void main(String[] args) {
		Circle myCircle = new Circle();

		myCircle.setR(2);
		myCircle.setCx(1);
		myCircle.setCy(5);

		System.out.println(myCircle.area());

	}

}
