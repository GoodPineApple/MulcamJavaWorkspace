package lab;

public class Student extends Human {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + ", " + major + "����";

	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProfession() {
		return "�̰���";
	}

	public static void main(String[] args) {
		Student mj = new Student("����", 21, "��ǻ��");
		Student mh = new Student("����", 22, "�濵");
		Student yj = new Student("����", 24, "����");

		System.out.println(mj.toString());
		System.out.println(mh.toString());
		System.out.println(yj.toString());
	}

}
