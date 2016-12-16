package dafault;

import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("표준체중계산기" + '\n' + "당신의 키를 입력하시오: ");
		int h = Input.nextInt();

		System.out.print("당신의 체중을 입력하시오: ");
		int w = Input.nextInt();
		
		double pw = (h - 100) * 0.9;

		if (w == (int) pw) {
			System.out.println("축하합니다. 표준체중입니다.");
		}
		if (w > (int) pw) {
			System.out.println("운동과 식사량 조절이 필요합니다. 과체중입니다.");
		} else
			System.out.println("저체중입니다ㅠㅠㅠㅠ");

	}

}
