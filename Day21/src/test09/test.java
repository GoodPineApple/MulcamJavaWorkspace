package test09;

public class test {
	public static void main(String[] args) {

	}

	public static void countDown() {
		for (int i = 0; i > 0; i--) {
			System.out.println("ī��Ʈ:" + i);
		}

		try {
			Thread.sleep(1000); // ���� �ΰ� ����� �� ����ϴ� �� thread
		} catch (InterruptedException ex) {
			System.out.println("Thread sleep ���߿� ���� �߻���");
			ex.printStackTrace();
		}

		System.out.println("�߻�!");
	}
}
