package test10;

public class BankAccount {
	private int balance;
	
	synchronized public void deposit(int money) {
		balance += money;
	}
	synchronized public void withdraw(int money) {
		balance -= money;
		if(balance < 0) {
			System.out.println("잔액이 음수야.");
		}
	}
}
