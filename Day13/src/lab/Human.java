package lab;

public class Human {
	private String name;
	private int age;
	private String profession;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age + "��";
	}

	public String getName() {
		return name;
	}

	public String getProfession() {
		return profession;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Human ch = new Human("����", 18);
		Human ml = new Human("����", 21);
		Human sd = new Human("���", 50);

		System.out.println(ch.toString());
		System.out.println(ml.toString());
		System.out.println(sd.toString());

	}

}
