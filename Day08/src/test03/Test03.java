package test03;

import java.util.Scanner;

public class Test03 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[] numbers = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("���� �Է�:");
//			numbers[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		for(int i = 0; i <3; i++) {
//			sum += numbers[i];
//		}
//		
//		System.out.println("�հ�  : " + sum);
//		System.out.println("��� : " + (sum/3));
//	}
//
//}
	public static void main(String[] args) {
		System.out.println("�迭�� ũ�⸦ �Է��Ͻÿ�. :");
			
		Scanner scan = new Scanner(System.in);

		int arraysize = scan.nextInt();
		int[] numbers = new int[arraysize];
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("���� �Է�:");
			numbers[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0; i <numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("�հ�  : " + sum);
		System.out.println("��� : " + ((double)sum/numbers.length));
	}

}

