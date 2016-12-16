package dafault;

import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int no1 = Input.nextInt();

		System.out.print("정수를 입력하시오: ");
		int no2 = Input.nextInt();

		System.out.print("정수를 입력하시오: ");
		int no3 = Input.nextInt();

		int min=0 ;

		if ((no1 > no2) && (no1 > no3)) {
			if (no2 > no3) {
				min = no3;
			} else {
				min = no2;
			}
		}

		if ((no2 > no3) && (no2 > no1)) {
			if (no3 > no1) {
				min = no1;
			} else {
				min = no3;
			}
		}

		if ((no3 > no1) && (no3 > no2)) {
			if (no2 > no1) {
				min = no1;
			} else {
				min = no2;
			}
		}

		System.out.println("가장 작은 숫자: " + min);
	}

}