package test01;

public class BankAccount {
	//�ʵ弳��κ�
	// ��ü ������ �ܾ� ������ �����ϰ� �����ϴ� �ɹ� ����
	int balance;
	///////////////////////////////////////////
	//�޼ҵ� ���� �κ�
	//�Ա��ϱ�
	void deposit (int money) {
		balance += money;
	}
	// ����ϱ�
	void withdraw (int money) {
		if (balance >= money){
		balance -= money;
		} else {
			System.out.println("�ܾ� ����");
		}
	}
	// �ܾ������� ��ü������(���������� �ִ� ������) ��������
	int getBalance(){
		return  balance;
	}
	//�ܾ��� 7.5% ��ŭ ������Ű��
	void addInterest() {
		balance += (int)(balance * 0.075);
	}

}
