package programmin01;

import java.util.*;

public class Pro02_02 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		final double P = 3.14;
		System.out.print("���� �������� �Է��Ͻÿ� : ");
		double r = Input.nextInt();
		double area = r * r * P;
		
		System.out.println("���� ���̴� " + area + "�Դϴ�.");
		System.out.print(" / ����Ͻðڽ��ϱ�?(Y/N)");
		String answer1 = Input.nextLine();
		String yn1 = answer1.toUpperCase();
		
		while (true) {
			if ((yn1).equals("Y")) {
				System.out.print("���� �������� �Է��Ͻÿ� : ");
				r = Input.nextInt();
				System.out.println(area);
				continue;
			} else if ((yn1).equals("N")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
