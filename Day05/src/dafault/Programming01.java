package dafault;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		int no1 = Input.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
		int no2 = Input.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
		int no3 = Input.nextInt();

		int first = 0, second = 0, third = 0;

		if ((no1 > no2) && (no1 > no3)) {
			first = no1;
			if (no2 > no3) {
				second = no2;
				third = no3;
			} else {
				second = no3;
				third = no2;
			}
		}

		if ((no2 > no3) && (no2 > no1)) {
			first = no2;
			if (no3 > no1) {
				second = no3;
				third = no1;
			} else {
				second = no1;
				third = no3;
			}
		}

		if ((no3 > no1) && (no3 > no2)) {
			first = no3;
			if (no2 > no1) {
				second = no2;
				third = no1;
			} else {
				second = no1;
				third = no2;
			}
		}

		System.out.println("���ĵ� ����: " + third + " " + second + " " + first);
	}

}
