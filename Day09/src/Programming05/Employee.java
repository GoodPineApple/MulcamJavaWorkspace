package Programming05;

public class Employee {
	private String name;
	private String callNumber;
	private int salary;
	
	public void setEmployee(String userName, String userCallNumber, int userSalary){
		name = userName;
		callNumber = userCallNumber;
		salary = userSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCallNumber() {
		return callNumber;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString(){
		return "직원 " + name + "의 전화번호는 " + callNumber + "이고, 연봉은 " + salary + "입니다.";
	}
	

}
