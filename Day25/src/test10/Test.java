package test10;

public class Test {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		User user1 = new User(b);
		User user2 = new User(b);
		
		user1.start();
		user2.start();
	}
}
