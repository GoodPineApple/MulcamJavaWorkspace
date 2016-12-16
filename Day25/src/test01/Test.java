package test01;

public class Test {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		
		for(int i=0; i<1000000; i++) {
			System.out.println("main i:"+i);
		}
	}

}
