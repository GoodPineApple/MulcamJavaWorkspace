package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.balance = 10000;
		
		int asd = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int money; // �Աݾ� �Ǵ� ��ݾ� �Է��� �� ����� ����
		while(true) {
			System.out.println("1.�Ա�  2.���  3.�ܾ���ȸ  -1.����");
			System.out.print("�۾�����>>");
			int select = scan.nextInt();
			
			
			switch(select) {
			case 1:
				System.out.println("�Աݾ�>>");
				money = scan.nextInt();
				b.deposit(money);
				break;
			case 2:
				System.out.println("�Աݾ�>>");
				money = scan.nextInt();
				b.withdraw(money);
				break; // switch Ż�� break;
			case 3:
				System.out.println("�����ܾ�=" + b.getBalance());
				break; // switch Ż�� break'
			default :
				System.out.println("�߸��� �Է��Դϴ�.");
			case -1 :
				break;
			}
			if(select == -1)
				System.out.println("===���α׷�����===");
				break;
		}

	}

}
