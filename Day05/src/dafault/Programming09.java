
package dafault;
import java.util.Scanner;

public class Programming09 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("������ ����" + '\n' + "+, -, *, / �� �ϳ��� �Է��Ͻÿ�:");
		String spelling = Input.nextLine();

		char c = spelling.charAt(0);

		System.out.print("������ ù��° ���� �Է��Ͻÿ� :");
		double no1 = Input.nextDouble();

		System.out.print("������ �ι�° ���� �Է��Ͻÿ� :");
		double no2 = Input.nextDouble();

		if (c == 42) {
			System.out.println(no1 * no2);
		}
		if (c == 43) {
			System.out.println(no1 + no2);
		}
		if (c == 45) {
			System.out.println(no1 - no2);
		}
		if (c == 47) {
			if (no2 == 0) {
				System.out.println("0�� ���� �� �����ϴ�.");
			} else {
				System.out.println(no1 / no2);
			}
		}
	}
}