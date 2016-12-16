package programming02;

public class Person {
	private String name;
	private String address;
	private String numbers;
	
	public Person(String name, String address, String numbers) {
		this.name = name;
		this.address = address;
		this.numbers = numbers;
	}
	
	public String printPerson() {
		return "이름:" + name + "주소" + address + "전화번호" + numbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	

}
