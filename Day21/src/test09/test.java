package test09;

public class test {
	public static void main(String[] args) {

	}

	public static void countDown() {
		for (int i = 0; i > 0; i--) {
			System.out.println("카운트:" + i);
		}

		try {
			Thread.sleep(1000); // 텀을 두고 출력할 때 사용하는 게 thread
		} catch (InterruptedException ex) {
			System.out.println("Thread sleep 도중에 예외 발생함");
			ex.printStackTrace();
		}

		System.out.println("발사!");
	}
}
