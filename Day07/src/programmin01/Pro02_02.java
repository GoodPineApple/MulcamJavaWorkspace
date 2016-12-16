package programmin01;

import java.util.*;

public class Pro02_02 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		final double P = 3.14;
		System.out.print("원의 반지름을 입력하시오 : ");
		double r = Input.nextInt();
		double area = r * r * P;
		
		System.out.println("원의 넓이는 " + area + "입니다.");
		System.out.print(" / 계속하시겠습니까?(Y/N)");
		String answer1 = Input.nextLine();
		String yn1 = answer1.toUpperCase();
		
		while (true) {
			if ((yn1).equals("Y")) {
				System.out.print("원의 반지름을 입력하시오 : ");
				r = Input.nextInt();
				System.out.println(area);
				continue;
			} else if ((yn1).equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
