package programming;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		int number; //��밡 �Է��� �� 
		double good = Math.random(); //0, 1, 2�� ������ ���� 
		int win = (int)(good*2)+1; //�ʵ� 
		
		Scanner scan = new Scanner(System.in);//�Է°� ��ĵ 
		
		System.out.print("�ϳ��� �����Ͻÿ�:"+" ����(0),"+" ����(1),"+" ��(2):");
		number = scan.nextInt();
	
		switch(win){//����ġ�� �ۼ� 
		case 0:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�");
			if (number == 0){
				System.out.println("�����ϴ�");
			}else if(number ==1){
				System.out.println("��ǻ�Ͱ� �����ϴ�");
			}else if (number ==2){
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
		break;
		case 1:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�");
			if (number == 0){
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}else if(number ==1){
				System.out.println("�����ϴ�");
			}else if (number ==2){
				System.out.println("��ǻ�Ͱ� �����ϴ�");
			}
			break;
		case 2:
			System.out.println("��ǻ�ʹ� ���� �����߽��ϴ�");
			if (number == 0){
				System.out.println("��ǻ�Ͱ� �����ϴ�");
			}else if(number ==1){
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}else if (number ==2){
				System.out.println("�����ϴ�");
			}
			break;
		}
		
	
		
	
	}
}
