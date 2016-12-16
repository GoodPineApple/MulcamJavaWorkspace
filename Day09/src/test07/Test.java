package test07;

public class Test {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		System.out.println(account);
		
		account.withdraw(8000);
		System.out.println(account);
	}

}
