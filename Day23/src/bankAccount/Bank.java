package bankAccount;

import java.util.LinkedList;

public class Bank {
	private String name;
	private String password;
	private int balance;
	private boolean isOk = false;

	private static final int acNumSeed = 11111; // 계좌번호를 부여하기위한 기본값
	private static int customerCount = 0; // 회원 수

	public static int getCustomerCount() {
		return customerCount;
	}

	public Bank() {
	
	}

	public Bank(String name, String password, int initialBalance) {
		this.name = name;
		this.password = password;
		this.balance = initialBalance;
		isOk = true;


	}

}
