package dafault;

import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		int no1 = Input.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
		int no2 = Input.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
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

		System.out.println("���� ���� ����: " + min);
	}

}