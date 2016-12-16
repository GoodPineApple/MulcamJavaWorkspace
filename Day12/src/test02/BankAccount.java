package test02;

public class BankAccount {
	
	private int balance; // �ܾ� ���� ����
	private String ownerName; // ������ �̸�
	private String accountNum; // ���¹�ȣ
/////////////////////////////////////////////////////
	
	public BankAccount(int initMoney, String name, String accountNum) {
		this.balance = initMoney;
		this.ownerName = name;
		this.accountNum = accountNum;
	}
//////////////////////////////////////////////////////

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
/////////////////////////////////////////////////////////////////////////
	//�Ա�, ���, �۱�, ������ȸ �޼ҵ� �����
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println("��ݿϷ�");
		} else {
			System.out.println("�ܾ׺���");
		}
	}
	
	public void printAccount() {
		System.out.println("****************************");
		System.out.println("*������:" + ownerName);
		System.out.println("*���¹�ȣ:" + accountNum);
		System.out.println("*�ܾ�:" + balance);
		System.out.println("****************************");
	}
	
	public void transfer(BankAccount other, int money) {
		if (balance >= money) {
		withdraw(money); // ���� ���¿����� ����ϰ�
		System.out.println("�۱� �Ϸ�");
		} else {
			System.out.println("�۱��ܾ� ����");
		}
		other.deposit(money); // ���޹��� �ּ��� ���°�ü�� �Ա�
	}

	
	
	
}
