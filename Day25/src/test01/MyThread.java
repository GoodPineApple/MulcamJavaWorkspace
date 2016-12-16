package test01;

public class MyThread extends Thread{ //상속통해 쓰레드

	@Override
	public void run() {
		// 현재 클래스의 객체 쓰레드가 해야하는 일 작성
		for(int i=0; i < 1000000; i++) {
			System.out.println("Thread i:" + i);
		}
		
	}
	

}
