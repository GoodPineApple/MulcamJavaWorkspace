package programming;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		int number; //상대가 입력할 수 
		double good = Math.random(); //0, 1, 2를 설정할 난수 
		int win = (int)(good*2)+1; //필드 
		
		Scanner scan = new Scanner(System.in);//입력값 스캔 
		
		System.out.print("하나를 선택하시요:"+" 가위(0),"+" 바위(1),"+" 보(2):");
		number = scan.nextInt();
	
		switch(win){//스위치문 작성 
		case 0:
			System.out.println("컴퓨터는 가위를 선택했습니다");
			if (number == 0){
				System.out.println("비겼습니다");
			}else if(number ==1){
				System.out.println("컴퓨터가 졌습니다");
			}else if (number ==2){
				System.out.println("컴퓨터가 이겼습니다");
			}
		break;
		case 1:
			System.out.println("컴퓨터는 바위를 선택했습니다");
			if (number == 0){
				System.out.println("컴퓨터가 이겼습니다");
			}else if(number ==1){
				System.out.println("비겼습니다");
			}else if (number ==2){
				System.out.println("컴퓨터가 졌습니다");
			}
			break;
		case 2:
			System.out.println("컴퓨터는 보를 선택했습니다");
			if (number == 0){
				System.out.println("컴퓨터가 졌습니다");
			}else if(number ==1){
				System.out.println("컴퓨터가 이겼습니다");
			}else if (number ==2){
				System.out.println("비겼습니다");
			}
			break;
		}
		
	
		
	
	}
}
