package dafault;
public class Test06 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + ":");
			for (int j = 1; j < i+2 ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}