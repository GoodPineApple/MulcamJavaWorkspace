import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("구입한 물건의 개수를 입력하시오 : ");
		int goods = Input.nextInt();

		int sum;
		if (goods >= 10) {
			sum = (goods * 100) * 9 / 10;
		} else {
			sum = goods * 100;
		}

		System.out.println("전체 가격 : " + sum);

	}

}
