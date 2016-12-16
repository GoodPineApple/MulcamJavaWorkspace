package day07pro01;

import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("물품번호를 입력하세요.");
		String productNum = scan.next();

		boolean isOk = true;

		if (productNum.length() == 6) {
			// 앞의 두자리가 알파뱃인지 검사하는 반복문
			for (int i = 0; i < 2; i++) {
				char c = productNum.charAt(i);
				if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
					isOk = false;
				}
			}
			// 뒤의 네자리가 숫자인지 검사하는 반복문
			for (int i = 2; i < 6; i++) {
				char c = productNum.charAt(i);
				if (c < '0' || c > '9') {
					isOk = false;
				}
			}
		} else {
			isOk = false;
		}

		if (isOk == true) {
			System.out.println("올바른 제품번호입니다.");
		} else {
			System.out.println("잘못된 제품번호입니다.");
		}

	}

}
