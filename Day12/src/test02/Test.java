package test02;

public class Test {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000000, "TM.Kim", "123456");
		BankAccount account2 = new BankAccount(1000, "hong11", "321645");
		
		account.transfer(account2, 500);
		
//		int money = 100000;
//		account.deposit(money); //��ü�� �Ա�
//		money = 500;
//		account.withdraw(money); // ��ü���� ���
//		
		account.printAccount();
		account2.printAccount();
		
		
		
	}

}
