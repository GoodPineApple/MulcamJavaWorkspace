package test02;

public class BankAccount {
	
	private int balance; // 잔액 저장 변수
	private String ownerName; // 소유주 이름
	private String accountNum; // 계좌번호
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
	//입금, 출금, 송금, 계좌조회 메소드 만들기
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println("출금완료");
		} else {
			System.out.println("잔액부족");
		}
	}
	
	public void printAccount() {
		System.out.println("****************************");
		System.out.println("*소유주:" + ownerName);
		System.out.println("*계좌번호:" + accountNum);
		System.out.println("*잔액:" + balance);
		System.out.println("****************************");
	}
	
	public void transfer(BankAccount other, int money) {
		if (balance >= money) {
		withdraw(money); // 현재 계좌에서는 출금하고
		System.out.println("송금 완료");
		} else {
			System.out.println("송금잔액 부족");
		}
		other.deposit(money); // 전달받은 주소의 계좌객체에 입금
	}

	
	
	
}
