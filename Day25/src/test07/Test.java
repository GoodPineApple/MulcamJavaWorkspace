package test07;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main�� ���۵Ǿ����ϴ�.");
		
		MyThread t = new MyThread();
		System.out.println("10ī��Ʈ �����带 �����մϴ�");
		
		t.start();
		
		System.out.println("2�ʸ� ��ٸ��� �����带 �����ϰڽ��ϴ�.");
		
		//���� �����尡 interrupt ������ ���� ��� ���� ����
		Thread.sleep(2000);
		
		t.interrupt();
		t.join();  // main���� ǥ�� ��������
		System.out.println("main����");
	}

}
