package programming07;

public class UnderGraduate extends Student {
	
	String circleName;
	
	public UnderGraduate() {
		super();
	}
	public UnderGraduate(String name, String studentNumber, String department, int grade, double credit, String circleName) {
		super(name, studentNumber, department, grade, credit);
		this.circleName = circleName;
	}
	
	public String printUnderGraduate() {
		return super.printStudent() + " µ¿¾Æ¸®:" + circleName;
	}
	
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	
	

}
