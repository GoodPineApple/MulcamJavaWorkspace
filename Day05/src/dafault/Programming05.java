package dafault;

import java.util.Scanner;

public class Programming05 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("x���� �Է��Ͻÿ� : ");
		double x = Input.nextDouble();
		double result;

		if (x <= 0) {
			result = x * x * x - 9 * x + 2;
		} else {
			result = 7 * x + 2;
		}

		System.out.println("�ռ��� ���� " + result + "�Դϴ�.");
	}

}
