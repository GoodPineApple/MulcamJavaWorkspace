package dafault;

import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("ǥ��ü�߰���" + '\n' + "����� Ű�� �Է��Ͻÿ�: ");
		int h = Input.nextInt();

		System.out.print("����� ü���� �Է��Ͻÿ�: ");
		int w = Input.nextInt();
		
		double pw = (h - 100) * 0.9;

		if (w == (int) pw) {
			System.out.println("�����մϴ�. ǥ��ü���Դϴ�.");
		}
		if (w > (int) pw) {
			System.out.println("��� �Ļ緮 ������ �ʿ��մϴ�. ��ü���Դϴ�.");
		} else
			System.out.println("��ü���Դϴ٤ФФФ�");

	}

}
