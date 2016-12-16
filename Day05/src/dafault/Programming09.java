
package dafault;
import java.util.Scanner;

public class Programming09 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("간단한 계산기" + '\n' + "+, -, *, / 중 하나를 입력하시오:");
		String spelling = Input.nextLine();

		char c = spelling.charAt(0);

		System.out.print("연산할 첫번째 수를 입력하시오 :");
		double no1 = Input.nextDouble();

		System.out.print("연산할 두번째 수를 입력하시오 :");
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
				System.out.println("0은 나눌 수 없습니다.");
			} else {
				System.out.println(no1 / no2);
			}
		}
	}
}