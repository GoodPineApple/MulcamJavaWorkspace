package programmin01;

import java.util.*;

public class Pro02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choose = "Y";
		
		while (true) {
			if ((choose.toUpperCase()).equals("Y")) {
				System.out.print("Type the radius: ");
				double r = input.nextDouble();
				double area = Math.PI * r * r;
				System.out.println(area);
				System.out.print("Do you wish to continue?(Y/N): ");
				choose = input.next();
				continue;
			} else if ((choose.toUpperCase()).equals("N")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.print("Type Y/N: ");
				choose = input.next();
				continue;
			}
		}
	}
}


