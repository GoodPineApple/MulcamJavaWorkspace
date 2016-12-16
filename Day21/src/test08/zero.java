package test08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zero {//예외처리에 있어서 부모-자식 변수간의 관계 설명 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2, result;

		try {
			
			System.out.print("num1:");
			n1 = scan.nextInt();
//			InputMismatchException
			
			System.out.print("num2:");
			n2 = scan.nextInt();
//			InputMismatchException 정수값 입력 예외 
			
			result = n1 / n2;
//		ArithmeticException - 계산 예외 
			System.out.println("결과:" + result);
			
			
		}  catch (Exception ex){ //부모-자식변수의 동적 바인딩 설명하면서 작성함 
			//arithmetic 이든, inputmismatch 등의 경우가 아닌 예외는 이 exception이 모두 수용함 
			System.out.println("나누기 0 이외 다른 예외가 발생");
			System.out.println("에러메세지:"+ ex.getMessage());
		}
		
		catch (ArithmeticException ex) {// 예외가 발생한 예외 객체의 주소값
			//더 큰 부모 예외인 exception이 위에 위치해있기 때문에 자식이 아니라 부모가 먼저 처리하므로 오류 메세지!!
			//정상적으로 작성하기 위해서는 이 catch문이 exception 위에 위치해야 한다!!!
			System.out.println("2번째 숫자에 0을 입력하면 오류"); // 예외일 경우에는 다음의 값 출력
			
		}
		
		
		finally { //예외든 아니든 어떻게든 마지막에 출력되는 값 
			System.out.println("프로그램 종료");
		}
		

	}
}
