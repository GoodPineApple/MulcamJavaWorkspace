package programming03;

public class Dice {
	
	private int face;
	
	public void rollDice(){
		face = (int)(Math.random()*6) + 1;
	}
	
	public void resultDice(){
		System.out.println("굴린 주사위의 값은 " + face + "입니다.");
	}
	

}
