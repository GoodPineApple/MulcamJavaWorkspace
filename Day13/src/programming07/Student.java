package programming07;

public class Student {

	private String name;
	private String studentNumber;
	private String department;
	private int grade;
	private double credit;

	public Student(String name, String studentNumber, String department, int grade, double credit) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.department = department;
		this.grade = grade;
		this.credit = credit;
	}

	public Student() {

	}

	public String printStudent() {
		return "이름:" + name + " 학번:" + studentNumber + " 학부:" + department + " 학년:" + grade + " 학점" + credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

}
