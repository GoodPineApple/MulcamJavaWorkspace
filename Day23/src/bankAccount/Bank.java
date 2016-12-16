package bankAccount;

import java.util.LinkedList;

public class Bank {
	private String name;
	private String password;
	private int balance;
	private boolean isOk = false;

	private static final int acNumSeed = 11111; // ���¹�ȣ�� �ο��ϱ����� �⺻��
	private static int customerCount = 0; // ȸ�� ��

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
