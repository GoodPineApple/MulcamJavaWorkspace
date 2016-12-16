import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int no1 = Input.nextInt();

		System.out.print("정수를 입력하시오 : ");
		int no2 = Input.nextInt();

		System.out.print("정수를 입력하시오 : ");
		int no3 = Input.nextInt();

		double avr = (no1 + no2 + no3) / 3;

		System.out.print("평균값 : " + avr);
	}

}
