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

		System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
		int reserve = Input.nextInt();

		if (reserve == 1) {
			while (true) {
				System.out.println("현재의 예약 상태는 다음과 같습니다." + "\n" + "1  2  3  4  5  6  7  8  9  10" + "\n"
						+ "----------------------------------------");
				for (int n : array) {
					System.out.print(n + "  ");
				}
				System.out.println();

				System.out.print("몇번째 좌석을 예약하시겠습니까?");
				reserve = Input.nextInt();

				array[reserve - 1] = 1;

				System.out.print(reserve + "석 예약이 완료되었습니다." + "\n" + "좌석을 예약하시겠습니까?(1 또는 0)");
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
			System.out.println("잘못된 응답입니다.");
		}

		if (isOk == false) {
			System.out.println("예약 프로그램을 종료합니다.");
		}

	}

}
