package amazone;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하시오 : ");
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
		System.out.println("배열 변형을 진행?");
		
		int a = 1;
		
		
		
	}

}
