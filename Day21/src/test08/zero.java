package test08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zero {//����ó���� �־ �θ�-�ڽ� �������� ���� ���� 
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
			System.out.println("���:" + result);
			
			
		}  catch (Exception ex){ //�θ�-�ڽĺ����� ���� ���ε� �����ϸ鼭 �ۼ��� 
			//arithmetic �̵�, inputmismatch ���� ��찡 �ƴ� ���ܴ� �� exception�� ��� ������ 
			System.out.println("������ 0 �̿� �ٸ� ���ܰ� �߻�");
			System.out.println("�����޼���:"+ ex.getMessage());
		}
		
		catch (ArithmeticException ex) {// ���ܰ� �߻��� ���� ��ü�� �ּҰ�
			//�� ū �θ� ������ exception�� ���� ��ġ���ֱ� ������ �ڽ��� �ƴ϶� �θ� ���� ó���ϹǷ� ���� �޼���!!
			//���������� �ۼ��ϱ� ���ؼ��� �� catch���� exception ���� ��ġ�ؾ� �Ѵ�!!!
			System.out.println("2��° ���ڿ� 0�� �Է��ϸ� ����"); // ������ ��쿡�� ������ �� ���
			
		}
		
		
		finally { //���ܵ� �ƴϵ� ��Ե� �������� ��µǴ� �� 
			System.out.println("���α׷� ����");
		}
		

	}
}
