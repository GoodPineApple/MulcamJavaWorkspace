package test02;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// 현재 클래스의 객체 쓰레드가 해야하는 일 작성
		for(int i=0; i < 1000000; i++) {
			System.out.println("Thread i:" + i);
		}
		
	}
	

}
