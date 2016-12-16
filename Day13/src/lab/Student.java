package lab;

public class Student extends Human {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + ", " + major + "전공";

	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProfession() {
		return "미공개";
	}

	public static void main(String[] args) {
		Student mj = new Student("명진", 21, "컴퓨터");
		Student mh = new Student("미현", 22, "경영");
		Student yj = new Student("용준", 24, "경제");

		System.out.println(mj.toString());
		System.out.println(mh.toString());
		System.out.println(yj.toString());
	}

}
