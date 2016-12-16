package lab;

public class BankAccountTest{
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.balance = 100;
		b.withdraw(60);
		
		System.out.println(b.getBalance());

		b.addInterest();
	}
}
