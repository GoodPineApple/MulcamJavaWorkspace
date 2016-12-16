package test08;

public class Test {

	public static void main(String[] args) {
		Date date = new Date();
		
		date.setDate(2016, "9¿ù", 21);
		System.out.println(date);
		date.pritDate();
		
		date.setYear(2010);
		System.out.println(date);
		date.pritDate();
		
		
	}

}
