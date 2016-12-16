package lab;

public class BankAccount {
	int balance;
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("잔액이 없습니다.");
		}
	}
	int getBalance() {
		return balance;
	}
	void addInterest() {
		balance += balance * 0.075;
		System.out.println(balance);
	}
	

}

