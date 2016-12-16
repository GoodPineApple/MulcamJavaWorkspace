
package dafault;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("구구단 계산기" + '\n' + "계산을 원하는 단수를 입력하시오 : ");
		int no1 = Input.nextInt();

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1) {
				System.out.print(no1 + "x" + i + "=" + no1 * i + '\t');
			}
		}

	}

}
