import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = Input.nextInt();

		if (num <= 0) {
			System.out.println("0 Ȥ�� ������ ����� �� �����ϴ�.");
		} else if (num <= 2) {
			System.out.println("3�� ����� �����ϴ�.");
		} else {
			for (int i = 3; i <= num; i++) {
				if (i % 3 == 0) {
					System.out.print(i + "  ");
				}
			}
		}
	}
}