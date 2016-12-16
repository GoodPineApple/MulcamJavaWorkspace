package dafault;
public class Programming06 {

	public static void main(String[] args) {

		int count = 0;

		for (int k = 2; k <= 100; k++) {
			count = 0;
			for (int a = 2; a <= k; a++) {

				if (k % a == 0) {
					break;
				}

				if (k % a != 0) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(count);
			}

		}
	}
}

// boolean 으로 트루만 출력하게
// while (k <= 100) {
// if (a % k == 0 ) {
// k++;
// System.out.println(a);
// }
// if (a % k != 0 || a < k)
// break;
//
