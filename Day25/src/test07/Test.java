package test07;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main이 시작되었습니다.");
		
		MyThread t = new MyThread();
		System.out.println("10카운트 쓰레드를 시작합니다");
		
		t.start();
		
		System.out.println("2초만 기다리고 쓰레드를 방해하겠습니다.");
		
		//메인 쓰레드가 interrupt 당할일 거의 없어서 예외 던짐
		Thread.sleep(2000);
		
		t.interrupt();
		t.join();  // main종료 표시 마지막에
		System.out.println("main종료");
	}

}
