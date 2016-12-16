package programming07;

public class Graduate extends Student {
	String assistnatType;
	double scholarship;
	
	public Graduate(String name, String studentNumber, String department, int grade, double credit, String assistnatType, double Scholarship0to1) {
		super(name, studentNumber, department, grade, credit);
		this.assistnatType = assistnatType;
		this.scholarship = scholarship;
	}
	
	public String printGraduate() {
		return super.printStudent() + " 조교유형:" + assistnatType + " 장학금비율:" + scholarship;
	}

	public String getAssistnatType() {
		return assistnatType;
	}

	public void setAssistnatType(String assistnatType) {
		this.assistnatType = assistnatType;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
	

}
