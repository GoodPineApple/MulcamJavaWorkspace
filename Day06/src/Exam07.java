import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = Input.nextInt();

		if (num <= 0) {
			System.out.println("0 혹은 음수는 계산할 수 없습니다.");
		} else if (num <= 2) {
			System.out.println("3의 배수가 없습니다.");
		} else {
			for (int i = 3; i <= num; i++) {
				if (i % 3 == 0) {
					System.out.print(i + "  ");
				}
			}
		}
	}
}