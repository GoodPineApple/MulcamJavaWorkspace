package amazone;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��Ͻÿ� : ");
		int inputNum = sc.nextInt();
		
		ArrayList<String> originalList = new ArrayList();
		for(int i=0; i<inputNum; i++){
			originalList.add("a" + (i + 1));			
		}
		for(int i=0; i<inputNum; i++){
			originalList.add("b" + (i + 1));			
		}
		
		for(int i=0; i<inputNum*2; i++){
			System.out.print(originalList.get(i));
		}
		System.out.println();
		System.out.println("---------");
		System.out.println("�迭 ������ ����?");
		
		int a = 1;
		
		
		
	}

}