package test07;

public class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		balance -= money;
	}
	
	public String toString() {
		return "���� �ܾ��� " + balance + "���Դϴ�.";
	}

}
