package test01;

public class BankAccount {
	//필드설계부분
	// 객체 내부의 잔액 정보를 저장하고 유지하는 맴버 변수
	int balance;
	///////////////////////////////////////////
	//메소드 설계 부분
	//입금하기
	void deposit (int money) {
		balance += money;
	}
	// 출금하기
	void withdraw (int money) {
		if (balance >= money){
		balance -= money;
		} else {
			System.out.println("잔액 부족");
		}
	}
	// 잔액정보를 객체밖으로(참조변수가 있는 곳으로) 내보내기
	int getBalance(){
		return  balance;
	}
	//잔액을 7.5% 만큼 증가시키기
	void addInterest() {
		balance += (int)(balance * 0.075);
	}

}
