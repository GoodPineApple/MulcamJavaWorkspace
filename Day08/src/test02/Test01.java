package test02;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		int[] pay = new int[5];
		for (int i = 0; i < pay.length; i++) {
			System.out.print("����" + (i+1) + "�� ������ �Է��Ͻÿ�.");
			pay[i] = Input.nextInt();
		}
		int sum = pay[0] + pay[1] + pay[2] + pay[3] + pay[4];
		int avr = sum / 5;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avr);
	}

}
