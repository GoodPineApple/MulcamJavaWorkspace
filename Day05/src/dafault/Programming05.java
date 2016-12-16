package dafault;

import java.util.Scanner;

public class Programming05 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("x값을 입력하시오 : ");
		double x = Input.nextDouble();
		double result;

		if (x <= 0) {
			result = x * x * x - 9 * x + 2;
		} else {
			result = 7 * x + 2;
		}

		System.out.println("합수의 값은 " + result + "입니다.");
	}

}
