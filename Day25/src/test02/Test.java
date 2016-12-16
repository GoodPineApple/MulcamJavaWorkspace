package test02;

public class Test {
	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		Thread tt = new Thread(t); 아래문장과 같은 의미
		Thread tt = new Thread(new MyThread());
		tt.start();
		
		for(int i=0; i<1000000; i++) {
			System.out.println("main i:"+i);
		}
	}

}
