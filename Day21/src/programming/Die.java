
package programming;

import java.io.InputStream;
import java.util.Scanner;

public class Die {

	public Die() {
	}

	public static void main(String[] args) {
		Die dicegame = new Die();
		
		int roll = (int) (Math.random() * 6) + 1; // ������ ������ �ֻ����� ��
		int computer = (int) (Math.random() * 6) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("�ֻ����� �������� : 1(������)");
		int value = scan.nextInt();
		
		
		if (value == 1) {
			System.out.println("���� ���� �ֻ����� ����" + roll + "�Դϴ�");
		System.out.println("��ǻ�Ͱ� ���� �ֻ����� ����"+computer+"�Դϴ�");
		
		if (roll != computer){
			if (roll>computer){
				System.out.println("�̰���ϴ�.");
			}else if(roll<computer){
				System.out.println("�����ϴ�");
			}
		}
		else if (roll == computer){
			System.out.println("�����ϴ�");
		}}
	}
}