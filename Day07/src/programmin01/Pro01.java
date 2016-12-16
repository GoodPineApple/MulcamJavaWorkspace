package programmin01;

import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("문자를 입력하시오 : ");
		String s = Input.nextLine();

		boolean isOk = true;

		if (s.length() == 6) {
			for (int i = 0; i < 2; i++) {
				char c = s.charAt(i);
				if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
					isOk = false;
				}
			}
			for (int i = 2; i < 6; i++) {
				char d = s.charAt(i);
				if (!(d > '0' && d < '9')) {
					isOk = false;
				}
			}

		} else {
			isOk = false; // false(1) 6자리가 아닐경우
		}

		if (isOk == true) { // isOk 참거짓 확인 출력
			System.out.println("입력 완료.");
		} else if(isOk == false){
			System.out.println("잘못된 문자열입니다.");
		}

	}

}

// 앞에 두글자는 영문(소문자, 대문자) 뒤에 네글자는 숫자(0~9) 총 6글자.
