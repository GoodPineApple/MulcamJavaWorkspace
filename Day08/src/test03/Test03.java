package test03;

import java.util.Scanner;

public class Test03 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[] numbers = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("숫자 입력:");
//			numbers[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		for(int i = 0; i <3; i++) {
//			sum += numbers[i];
//		}
//		
//		System.out.println("합계  : " + sum);
//		System.out.println("평균 : " + (sum/3));
//	}
//
//}
	public static void main(String[] args) {
		System.out.println("배열의 크기를 입력하시오. :");
			
		Scanner scan = new Scanner(System.in);

		int arraysize = scan.nextInt();
		int[] numbers = new int[arraysize];
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("숫자 입력:");
			numbers[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0; i <numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("합계  : " + sum);
		System.out.println("평균 : " + ((double)sum/numbers.length));
	}

}

