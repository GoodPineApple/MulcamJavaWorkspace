package programming01;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = 0;
		}
		array[5] = 1;
		array[6] = 1;
		array[7] = 1;

		boolean isOk = true;

		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		int reserve = Input.nextInt();

		if (reserve == 1) {
			while (true) {
				System.out.println("������ ���� ���´� ������ �����ϴ�." + "\n" + "1  2  3  4  5  6  7  8  9  10" + "\n"
						+ "----------------------------------------");
				for (int n : array) {
					System.out.print(n + "  ");
				}
				System.out.println();

				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
				reserve = Input.nextInt();

				array[reserve - 1] = 1;

				System.out.print(reserve + "�� ������ �Ϸ�Ǿ����ϴ�." + "\n" + "�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
				reserve = Input.nextInt();
				if (reserve == 0) {
					isOk = false;
					break;
				}
			}

		} else if (reserve == 0) {
			isOk = false;
		} else {
			isOk = false;
			System.out.println("�߸��� �����Դϴ�.");
		}

		if (isOk == false) {
			System.out.println("���� ���α׷��� �����մϴ�.");
		}

	}

}
