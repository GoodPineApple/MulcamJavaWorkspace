
package programming;

import java.io.InputStream;
import java.util.Scanner;

public class Die {

	public Die() {
	}

	public static void main(String[] args) {
		Die dicegame = new Die();
		
		int roll = (int) (Math.random() * 6) + 1; // 던져서 나오는 주사위의 수
		int computer = (int) (Math.random() * 6) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("주사위를 던지세요 : 1(던지기)");
		int value = scan.nextInt();
		
		
		if (value == 1) {
			System.out.println("내가 던진 주사위의 수는" + roll + "입니다");
		System.out.println("컴퓨터가 던진 주사위의 수는"+computer+"입니다");
		
		if (roll != computer){
			if (roll>computer){
				System.out.println("이겼습니다.");
			}else if(roll<computer){
				System.out.println("졌습니다");
			}
		}
		else if (roll == computer){
			System.out.println("비겼습니다");
		}}
	}
}