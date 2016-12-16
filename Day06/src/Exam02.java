import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("초 단위의 시간을 입력하시오 : ");
		int time = Input.nextInt();

		int second = time % 60;
		int min = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.println(time + "초는 " + hour + "시간 " + min + "분 " + second + "초이다.");

	}

}
