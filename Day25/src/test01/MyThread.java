package test01;

public class MyThread extends Thread{ //������� ������

	@Override
	public void run() {
		// ���� Ŭ������ ��ü �����尡 �ؾ��ϴ� �� �ۼ�
		for(int i=0; i < 1000000; i++) {
			System.out.println("Thread i:" + i);
		}
		
	}
	

}
