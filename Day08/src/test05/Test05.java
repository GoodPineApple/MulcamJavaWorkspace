package test05;

public class Test05 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		
		b1.balance = 1000;
		b2.balance = 1000;
		b3.balance = 1000;
////////////////////////////////////////////////////
		BankAccount[] b = new BankAccount[3];
		for(int i =0; i <3; i++) {
			b[i] = new BankAccount();
		}
		for(int i=0; i<3; i++) {
			b[i].balance = 1000;
		}
		
	}

}
