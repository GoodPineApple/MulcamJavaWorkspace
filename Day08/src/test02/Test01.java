package test02;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		int[] pay = new int[5];
		for (int i = 0; i < pay.length; i++) {
			System.out.print("직원" + (i+1) + "의 월급을 입력하시오.");
			pay[i] = Input.nextInt();
		}
		int sum = pay[0] + pay[1] + pay[2] + pay[3] + pay[4];
		int avr = sum / 5;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avr);
	}

}
