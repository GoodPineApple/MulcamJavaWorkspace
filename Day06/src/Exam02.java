import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("�� ������ �ð��� �Է��Ͻÿ� : ");
		int time = Input.nextInt();

		int second = time % 60;
		int min = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.println(time + "�ʴ� " + hour + "�ð� " + min + "�� " + second + "���̴�.");

	}

}
