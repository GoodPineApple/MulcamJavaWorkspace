package test10;

public class test {
	public static void main(String[] args) {

		try{
			countDown();
		} 
		
		catch(InterruptedException ex){
			System.out.println("����ó���� countDown�� ����");
			ex.printStackTrace();
		}
		
		
	}

	public static void countDown() throws InterruptedException {//thread���� throw�� ����
		for (int i = 0; i > 0; i--) {
			System.out.println("ī��Ʈ:" + i);
		Thread.sleep(1000);//thread ���� ������ ���� ������ ���� 
		}

		System.out.println("�߻�!");
	}
}
