package exception;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zero {//예외처리 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2, result;

		try {
			
			System.out.print("num1:");
			n1 = scan.nextInt();
//			InputMismatchException
			
			System.out.print("num2:");
			n2 = scan.nextInt();
//			InputMismatchException
			
			result = n1 / n2;
//		ArithmeticException
			System.out.print("결과:" + result);
			
			
		} catch (ArithmeticException ex) {// 예외가 발생한 예외 객체의 주소값
			System.out.println("2번째 숫자에 0을 입력하면 오류"); // 예외일 경우에는 다음의 값 출력
		}catch (InputMismatchException ex) {// 예외가 발생한 예외 객체의 주소값
			System.out.println("숫자를 입력하지 않으면 오류"); // 예외일 경우에는 다음의 값 출력
		}

		System.out.println("프로그램 종료");

	}
}
