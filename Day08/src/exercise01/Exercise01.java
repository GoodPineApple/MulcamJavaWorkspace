package exercise01;

public class Exercise01 {
	public static void main(String[] args) {
		int[] studentNumbers = new int[30]; // 01_01
		double[] values = { 1.2, 3.3, 6.7 }; // 01_02

		int[] numbers = new int[100]; // 02_01
		double[] rainfalls = new double[100]; // 02_02

		// 03_01 : int[0] ~ int[4] 총 5개
		// 03_02 : 오류 발생.
		
		int[] a = { 1, 2, 3, 4, 5 }; // 05
		int[] b = new int[a.length];
		for (int i = 0; i < 5; i++) {
			b[i] = a[i];
		}
	
		// 06 : null 제외한 참조변수는 2개. employee, employee[0]

	}

}
