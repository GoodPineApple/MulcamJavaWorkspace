package test02;

public class Test {
	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		Thread tt = new Thread(t); �Ʒ������ ���� �ǹ�
		Thread tt = new Thread(new MyThread());
		tt.start();
		
		for(int i=0; i<1000000; i++) {
			System.out.println("main i:"+i);
		}
	}

}
