package programming07;

public class Test {

	public static void main(String[] args) {
		Graduate num1 = new Graduate("blief", "1111", "java", 1, 2.9, "연구조교", 0.9);
		UnderGraduate num2 = new UnderGraduate("ktm", "2222", "social", 4, 4.5, "BIS");
		System.out.println(num1.printGraduate());
		System.out.println(num1.printStudent());
		System.out.println(num2.printStudent());
		System.out.println(num2.printUnderGraduate());
		
	}

}
