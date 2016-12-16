package dafault;
public class Programming07 {
	public static void main(String[] args) {
		int a,b,c;
		for (a=1; a < 100; a++) {
			for (b=1; b < 100; b++) {
				for (c=1; c < 100; c++)
					if (c * c == a * a + b * b) {
						System.out.println(a + "," + b +"," + c);
					}
			}
		}

	}

}
