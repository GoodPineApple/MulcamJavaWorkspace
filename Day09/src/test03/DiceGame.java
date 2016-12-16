package test03;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private int randomNumber;
	private int userGuess;
	
	private void rollDice(){
		randomNumber = (int)(Math.random()*10) + 1;  //Math.random은 0~1 소수를 뽑음
		randomNumber = new Random().nextInt(10) + 1; //0~9(arg)범위 10개를 뽑음
	}
	
	private void inputUserGuess(){
		Scanner scan = new Scanner(System.in);
		System.out.println("추측하는 숫자 입력: ");
		userGuess = scan.nextInt();
	}
	
	private void checkAnswer() {
		if(randomNumber == userGuess) {
			System.out.println("맞추셨습니다! 축하합니다!!");
		} else {
			System.out.println("틀렸습니다.. 정답은" + randomNumber + "입니다.");
		}
	}
	
	public void startGame() {
		rollDice();
		inputUserGuess();
		checkAnswer();
	}
}
