package programming03;

import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오: ");
		int nos = Input.nextInt(); // nos가 array.length
		int[] array = new int[nos];

		for (int i = 0; i < array.length; i++) {
			System.out.print("학생 " + (i + 1) + "의 성적을 입력하시오: ");
			int score = Input.nextInt();
			if (score > 100 || score < 0) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
				continue;
			}
			array[i] = score;
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("성적 평균은 " + (double) sum / array.length + "입니다.");

	}
}
