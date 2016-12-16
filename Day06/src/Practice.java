import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);

		System.out.println("정수를 입력하시오 : ");
		int no1 = Input.nextInt();

		int sum = 0;
		int x = 0;

		for (int i = 10; i < no1 * 10; i *= 10) {
			for (int j = 1; j < no1; j *= 10) {
				x = (no1 % i) / j;
			}
			sum += x;
		}
		System.out.println(sum);
	}
}
