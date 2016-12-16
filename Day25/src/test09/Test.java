package test09;

public class Test {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();

		User user1 = new User(b);
		User user2 = new User(b);

		user1.start();
		user2.start();
	} 
}  // synchronized가 안됬을 경우 동기화문제 발생.
