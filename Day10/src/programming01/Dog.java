package programming01;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		breed = null;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
}
