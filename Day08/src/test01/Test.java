package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.balance = 10000;
		
		int asd = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int money; // 입금액 또는 출금액 입력할 때 사용할 변수
		while(true) {
			System.out.println("1.입금  2.출금  3.잔액조회  -1.종료");
			System.out.print("작업선택>>");
			int select = scan.nextInt();
			
			
			switch(select) {
			case 1:
				System.out.println("입금액>>");
				money = scan.nextInt();
				b.deposit(money);
				break;
			case 2:
				System.out.println("입금액>>");
				money = scan.nextInt();
				b.withdraw(money);
				break; // switch 탈출 break;
			case 3:
				System.out.println("현재잔액=" + b.getBalance());
				break; // switch 탈출 break'
			default :
				System.out.println("잘못된 입력입니다.");
			case -1 :
				break;
			}
			if(select == -1)
				System.out.println("===프로그램종료===");
				break;
		}

	}

}
