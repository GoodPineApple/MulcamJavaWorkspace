package test09;

public class BankAccount {
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
		if(balance < 0) {
			System.out.println("�ܾ��� ������.");
		}
	}
}
