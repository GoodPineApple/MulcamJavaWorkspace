package test07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zero {//����ó�� 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2, result;

		try {
			
			System.out.print("num1:");
			n1 = scan.nextInt();
//			InputMismatchException
			
			System.out.print("num2:");
			n2 = scan.nextInt();
//			InputMismatchException ������ �Է� ���� 
			
			result = n1 / n2;
//		ArithmeticException - ��� ���� 
			System.out.print("���:" + result);
			
			
		} catch (ArithmeticException ex) {// ���ܰ� �߻��� ���� ��ü�� �ּҰ�
			System.out.println("2��° ���ڿ� 0�� �Է��ϸ� ����"); // ������ ��쿡�� ������ �� ���
		} finally { //���ܵ� �ƴϵ� ��Ե� �������� ��µǴ� �� 
			System.out.println("���α׷� ����");
		}
		

	}
}
