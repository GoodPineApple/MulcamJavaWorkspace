package programming02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Person tm = new Person("taemin", "suwon", "888888");
		System.out.println(tm.printPerson());
		
		Customer tm2 = new Customer("tinmae", "seoul", "111111", "2145", 900);
		System.out.println(tm2.printPerson());
		
		
	}

}
