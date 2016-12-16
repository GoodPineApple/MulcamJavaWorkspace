package test07;

public class MyThread extends Thread{
	public void run() {
		try{for(int i =0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			System.out.println("9까지 세야하는데.. 방해받음...");
		}
		System.out.println("MyThread 종료");
	}

}
