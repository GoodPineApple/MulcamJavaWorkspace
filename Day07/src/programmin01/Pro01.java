package programmin01;

import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		String s = Input.nextLine();

		boolean isOk = true;

		if (s.length() == 6) {
			for (int i = 0; i < 2; i++) {
				char c = s.charAt(i);
				if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
					isOk = false;
				}
			}
			for (int i = 2; i < 6; i++) {
				char d = s.charAt(i);
				if (!(d > '0' && d < '9')) {
					isOk = false;
				}
			}

		} else {
			isOk = false; // false(1) 6�ڸ��� �ƴҰ��
		}

		if (isOk == true) { // isOk ������ Ȯ�� ���
			System.out.println("�Է� �Ϸ�.");
		} else if(isOk == false){
			System.out.println("�߸��� ���ڿ��Դϴ�.");
		}

	}

}

// �տ� �α��ڴ� ����(�ҹ���, �빮��) �ڿ� �ױ��ڴ� ����(0~9) �� 6����.
