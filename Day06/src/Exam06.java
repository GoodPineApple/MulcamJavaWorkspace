import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("������ ������ ������ �Է��Ͻÿ� : ");
		int goods = Input.nextInt();

		int sum;
		if (goods >= 10) {
			sum = (goods * 100) * 9 / 10;
		} else {
			sum = goods * 100;
		}

		System.out.println("��ü ���� : " + sum);

	}

}
