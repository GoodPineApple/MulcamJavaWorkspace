package programming02;

public class Customer extends Person {
	String customNumbers;
	int mileage;
	
	public Customer(String name, String address, String numbers, String customNumbers, int mileage) {
		super(name, address, numbers);
		this.customNumbers = customNumbers;
		this.mileage = mileage;
	}

	public String printPerson() {
		return super.printPerson() + "고객번호" + customNumbers + "마일리지" + mileage;
	}
	
	public String getCustomNumbers() {
		return customNumbers;
	}

	public void setCustomNumbers(String customNumbers) {
		this.customNumbers = customNumbers;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	

}
