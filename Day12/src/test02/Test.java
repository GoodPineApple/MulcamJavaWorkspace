package test02;

public class Test {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000000, "TM.Kim", "123456");
		BankAccount account2 = new BankAccount(1000, "hong11", "321645");
		
		account.transfer(account2, 500);
		
//		int money = 100000;
//		account.deposit(money); //객체에 입금
//		money = 500;
//		account.withdraw(money); // 객체에서 출금
//		
		account.printAccount();
		account2.printAccount();
		
		
		
	}

}
