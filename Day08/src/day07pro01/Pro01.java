package day07pro01;

import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("��ǰ��ȣ�� �Է��ϼ���.");
		String productNum = scan.next();

		boolean isOk = true;

		if (productNum.length() == 6) {
			// ���� ���ڸ��� ���Ĺ����� �˻��ϴ� �ݺ���
			for (int i = 0; i < 2; i++) {
				char c = productNum.charAt(i);
				if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
					isOk = false;
				}
			}
			// ���� ���ڸ��� �������� �˻��ϴ� �ݺ���
			for (int i = 2; i < 6; i++) {
				char c = productNum.charAt(i);
				if (c < '0' || c > '9') {
					isOk = false;
				}
			}
		} else {
			isOk = false;
		}

		if (isOk == true) {
			System.out.println("�ùٸ� ��ǰ��ȣ�Դϴ�.");
		} else {
			System.out.println("�߸��� ��ǰ��ȣ�Դϴ�.");
		}

	}

}