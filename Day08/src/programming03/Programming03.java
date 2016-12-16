package programming03;

import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		int nos = Input.nextInt(); // nos�� array.length
		int[] array = new int[nos];

		for (int i = 0; i < array.length; i++) {
			System.out.print("�л� " + (i + 1) + "�� ������ �Է��Ͻÿ�: ");
			int score = Input.nextInt();
			if (score > 100 || score < 0) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				i--;
				continue;
			}
			array[i] = score;
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("���� ����� " + (double) sum / array.length + "�Դϴ�.");

	}
}
